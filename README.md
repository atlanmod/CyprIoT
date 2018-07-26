![CyprIoT Logo](logo.png)

A Domain-Specific language (DSL) to design network of things easily.

[![Build Status](https://travis-ci.org/atlanmod/CyprIoT.svg?branch=master)](https://travis-ci.org/atlanmod/CyprIoT)

## Project Structure

* ``org.atlanmod.cypriot`` : Provides the Xtext grammar definition and the scoping
* ``org.atlanmod.cypriot.generator`` : Code generator
* ``org.atlanmod.cypriot.ide`` : Platform-independent IDE functionality 
* ``org.atlanmod.cypriot.ui`` : Eclipse editor for the language
* ``org.atlanmod.cypriot.test`` : Language unit tests

## Requirements

* Eclipse Modeling Tools Oxygen or newer
* Xtext 2.14+
* Maven 3.5+

## Installation

The project consists of the following artifacts : 

* A Code syntax, formalized [here](https://github.com/atlanmod/CyprIoT/tree/master/org.atlanmod.cypriot/src/org/atlanmod/cypriot)
* Code generators, available in generators package

How to get started :

* Run ``mvn clean install`` at the root of the project	
* Import the project into Eclipse
* Right-Click on ``org.atlanmod.cypriot`` package
* Hit Run As -> Eclipse Application
* Enjoy network modeling !

## Usage

The DSL can be used to model a network of heterogeneous devices. Device modeling has to be done using [ThingML](https://github.com/TelluIoT/ThingML). The configuration should have an external port. The latter will be overriden by the network configuration.

To run some examples of the language :

* In the Eclipse Application launched earlier
* Import the folder ``examples`` as a maven project
* Create or open a ``.cy`` file, enjoy network modeling !

## Contributors

* imberium