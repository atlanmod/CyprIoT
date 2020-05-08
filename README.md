![CyprIoT Logo](logo.png)

## What is CyprIoT?
CyprIoT is a tool to compose a network of things using Model-Driven engineering techniques. It consists of a Domain-Specific language (DSL) that enables designing the network, and a code generator to produce the deployable code of your network.

[![Build Status](https://travis-ci.org/atlanmod/CyprIoT.svg?branch=master)](https://travis-ci.org/atlanmod/CyprIoT)
[![Plugin](https://img.shields.io/badge/plugin--blue.svg)](https://www.atlanmod.org/updates/cypriot/snapshot/)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

![CyprIoT DSL Demo](demo.gif)

## Features

* Model a network of heterogeneous devices using a DSL, formalized using Xtext [here](https://github.com/atlanmod/CyprIoT/tree/master/org.atlanmod.cypriot/src/org/atlanmod/cypriot)
* Generate working code of the network from the model
* Specify and enforce a policy into the network

## Project Structure

* ``language`` : Provides the langugage grammar
* ``generator`` : Code generator
* ``examples`` : Few examples

## Requirements

* Device modeling has to be done using [ThingML](https://github.com/TelluIoT/ThingML). The configuration should have one external port. The latter will be overriden by the protocol specified in the network configuration.
* Maven 3.5+

### For Eclipse
* Eclipse Modeling Tools Oxygen or newer
* Xtext 2.14+
* Maven integration for Eclipse 1.5+
* [ThingML](https://github.com/TelluIoT/ThingML) for Eclipse


## Installation

### CLI
* Clone the project ``git clone https://github.com/atlanmod/CyprIoT.git``
* Run ``mvn clean install  -U`` at the root of the project	

### Eclipse
## As an Eclipse Plugin
* ``Help -> Install New Software -> Add``
* Fill the field ``Name`` with ``CyprIoT`` 
* Paste in the ``Location`` field this URL : ``https://www.atlanmod.org/updates/cypriot/snapshot/`` then hit ``Add``
* Choose ``CyprIoT Feature`` then hit ``Next`` and complete the installation procedure
## Import the source code
* Import as a maven project in Eclipse ``File -> Import -> Maven -> Existing Maven Projects -> Choose the cloned repository``, if you have already cloned the repo
OR
* ``File -> Import -> Git -> Projects from Git -> Clone URI``, then complete the procedure
* At the root of the project ``Right-Click -> Run As -> Maven clean`` then ``Maven install``

### Notepad++ Syntax Highlighting
* Open Notepad++
* ``Language -> Define your language... -> Import``, then select the file ``cypriot-notepad++.xml`` provided in this repository
* Open any file with ``.cy`` extension to have syntax highlighting for CyprIoT

## Usage 

* Right-Click on ``org.atlanmod.cypriot`` package
* Hit ``Run As -> Eclipse Application``
* Create or open a ``.cy`` file, enjoy network modeling !

## Examples

To run some examples of the language :

* Import the folder ``examples``
* To be continued

## Known issues

### Eclipse
* If you still see errors after the import, try ``Right-Click -> Refresh`` or ``Right-Click -> Maven -> Update Project... -> OK``
* If the ``.pom`` file shows an error on ``<packaging>eclipse-plugin</packaging>``, hover the error then click on ``Discover new m2e connectors -> Auto Select`` then install the required connectors and restart

## Research Papers

* **A Model-Driven Approach to Unravel the Interoperability Problem of the Internet of Things.**
Berrouyne I, Adda M, Mottu JM, Royer JC, Tisi M.
InProceedings of Advanced Information Networking and Applications 2020 Apr 15, Springer

* **CyprIoT: framework for modelling and controlling network-based IoT applications.**
Berrouyne I, Adda M, Mottu JM, Royer JC, Tisi M. 
InProceedings of the 34th ACM/SIGAPP Symposium on Applied Computing 2019 Apr 8 (pp. 832-841). ACM.

* **Towards Model-Based Communication Control for the Internet of Things.**
Berrouyne I, Adda M, Mottu JM, Royer JC, Tisi M. 
InFederation of International Conferences on Software Technologies: Applications and Foundations 2018 Jun 25 (pp. 644-655). Springer, Cham.

## Contributors

* imberium