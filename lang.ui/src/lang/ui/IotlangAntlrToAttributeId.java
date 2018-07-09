package lang.ui;

import java.util.HashSet;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class IotlangAntlrToAttributeId extends AbstractAntlrTokenToAttributeIdMapper {
	HashSet<String> definedproperties = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'capacity'", "'domain'"}));
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (definedproperties.contains(tokenName)) 
			return IotlangextendsHighlighting.DEFINED_ID;
		
		return IotlangextendsHighlighting.DEFAULT_TEXT_ID;
	}
}
