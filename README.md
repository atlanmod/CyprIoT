![CyprIoT Logo](logo.png)

A Domain-Specific language (DSL) to design network of things easily.

[![Build Status](https://travis-ci.org/atlanmod/CyprIoT.svg?branch=master)](https://travis-ci.org/atlanmod/CyprIoT)

## Prerequisites
* Xtext 2.14+
* EMF
* Maven

## Installation

The project consists of the following artifacts : 

* A Code syntax, formalized in language/iotlang.xtext
* Code generators, available in generators package

How to get started :

* Right-click on language/src/GenerateIotlang.mwe2
* Hit Run As -> MWE2 Workflow
* Right-Click on language
* Hit Run As -> Eclipse Application
* Enjoy network modeling !

## Usage

The DSL can be used to model a network of heterogeneous devices. Device modeling has to be done using [ThingML](https://github.com/TelluIoT/ThingML). The configuration should have an external port. The latter will be overriden by the network configuration.

## Contributors

* imberium