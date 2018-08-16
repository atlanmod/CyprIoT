package org.atlanmod.cypriot.generator.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ExecutionContext {

	public static class ExecutionNode {

		public String classId = null;
		public String methodId = null;
		public ExecutionNode parentNode = null;
		public List<ExecutionNode> childrenNode = new ArrayList<ExecutionNode>();
	}

	protected static Map<Thread, ExecutionNode> roots = new ConcurrentHashMap<Thread, ExecutionNode>();

	protected static Map<Thread, ExecutionNode> currentParents = new ConcurrentHashMap<Thread, ExecutionNode>();

	public static void pre(String contextId, String methodId) {
		Logger log = LogManager.getLogger(contextId);
		log.debug("Running method : "+methodId);
		Thread currentThread = Thread.currentThread();
		ExecutionNode currentNode = new ExecutionNode();
		if (roots.get(currentThread) == null) {
			roots.put(currentThread, currentNode);
		}

		currentNode.classId = contextId;
		currentNode.methodId = methodId;

		currentNode.parentNode = currentParents.get(currentThread);
		if (currentNode.parentNode != null) {
			currentNode.parentNode.childrenNode.add(currentNode);
		}
		currentParents.put(currentThread, currentNode);
	}

	public static void post() {
		Thread currentThread = Thread.currentThread();
		ExecutionNode node = currentParents.get(currentThread);
		if (node.parentNode != null) {
			currentParents.put(currentThread, node.parentNode);
		} else {
			currentParents.remove(currentThread);
			roots.remove(currentThread);
		}
	}

	public static ExecutionNode root() {
		return roots.get(Thread.currentThread());
	}

	public static void clearContext() {
		roots.remove(Thread.currentThread());
		currentParents.remove(Thread.currentThread());
	}
}
