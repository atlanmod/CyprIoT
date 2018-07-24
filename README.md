![CyprIoT Logo](logo.png)

A Domain-Specific language (DSL) to design network of things easily.

[![Build Status](https://travis-ci.org/atlanmod/CyprIoT.svg?branch=master)](https://travis-ci.org/atlanmod/CyprIoT)

## Prerequisites

* Eclipse Modeling Tools Oxygen or newer
* Xtext 2.14+
* Maven

## Installation

The project consists of the following artifacts : 

* A Code syntax, formalized [here](https://github.com/atlanmod/CyprIoT/tree/master/org.atlanmod.cypriot/src/org/atlanmod/cypriot)
* Code generators, available in generators package

How to get started :

* Run ``mvn clean install``
* Import the project into Eclipse
* Right-Click on ``org.atlanmod.cypriot`` package
* Hit Run As -> Eclipse Application
* Enjoy network modeling !

## Usage

The DSL can be used to model a network of heterogeneous devices. Device modeling has to be done using [ThingML](https://github.com/TelluIoT/ThingML). The configuration should have an external port. The latter will be overriden by the network configuration.

To run some examples of the language :

* In the Eclipse Application launched earlier
* Import the folder ``examples`` as a maven project
* Open any ``.cy`` file

## Contributors

* imberium