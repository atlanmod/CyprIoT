![CyprIoT Logo](logo.png)

## What is CyprIoT?
CyprIoT is tool to help compose a network of things using Model-Driven engineering techniques. A Domain-Specific language (DSL) enables you to design the network. Using code generation you can produce working code to deploy in your network.

[![Build Status](https://travis-ci.org/atlanmod/CyprIoT.svg?branch=master)](https://travis-ci.org/atlanmod/CyprIoT) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/514aac3f5239460281668f1bc65305d3)](https://www.codacy.com/app/imberium/CyprIoT?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=atlanmod/CyprIoT&amp;utm_campaign=Badge_Grade) [![codecov](https://codecov.io/gh/atlanmod/CyprIoT/branch/master/graph/badge.svg)](https://codecov.io/gh/atlanmod/CyprIoT) LoC:1621

## Features

* Model a network of heterogeneous devices using a DSL, formalized using Xtext [here](https://github.com/atlanmod/CyprIoT/tree/master/org.atlanmod.cypriot/src/org/atlanmod/cypriot)
* Generate code working code of the network from the model

## Project Structure

* ``org.atlanmod.cypriot`` : Provides the Xtext grammar definition and the scoping
* ``org.atlanmod.cypriot.generator`` : Code generator
* ``org.atlanmod.cypriot.ide`` : Platform-independent IDE functionality 
* ``org.atlanmod.cypriot.ui`` : Eclipse editor for the language
* ``org.atlanmod.cypriot.test`` : Language unit tests
* ``org.atlanmod.cypriot.examples`` : Few examples

## Requirements

* Device modeling has to be done using [ThingML](https://github.com/TelluIoT/ThingML). The configuration should have one external port. The latter will be overriden by the protocol specified in the network configuration.
* Maven 3.5+

### For Eclipse
* Eclipse Modeling Tools Oxygen or newer
* Xtext 2.14+
* Maven integration for Eclipse 1.5+
* [ThingML](https://github.com/TelluIoT/ThingML) for Eclipse


## Installation

* Clone the project ``git clone https://github.com/atlanmod/CyprIoT.git``
* Run ``mvn clean install  -U`` at the root of the project	
* Import as a maven project in Eclipse ``File -> Import -> Maven -> Existing Maven Projects -> Choose the cloned repository``

## Usage 

* Right-Click on ``org.atlanmod.cypriot`` package
* Hit ``Run As -> Eclipse Application``
* Create or open a ``.cy`` file, enjoy network modeling !

## Examples

To run some examples of the language :

* In the Eclipse Application launched earlier
* Import the folder ``org.atlanmod.cypriot.examples`` as a maven project


## Contributors

* imberium