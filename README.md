Gatling with Java DSL catalyst project
============================================

A starterkit showcase project for Gatling with Java DSL.

This project is written in Java DSL for Gatling.

It includes:

* [Maven Wrapper](https://maven.apache.org/wrapper/), so that you can immediately run Maven with `./mvnw` without having
  to install it on your computer
* minimal `pom.xml`
* latest version of `io.gatling:gatling-maven-plugin` applied
* sample [Simulation](https://gatling.io/docs/gatling/reference/current/general/concepts/#simulation) class,
  demonstrating sufficient Gatling functionality
* proper source file layout

###  System Setup

#### Install homebrew

`/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`

#### Install Java and
Now that you have homebrew,you can get JDK using Homebrew cask.

`brew cask install java`

#### Get Maven

`brew install maven`


Finally clone or download this repo & import it on IntelliJ as a maven project
to clone:

`git clone https://github.com/twCatalyst/<git repo>`


To run a simulation:
Example to run withFeederSimulation


`mvn gatling:test -Dgatling.simulationClass=exampleSimulations.withFeederSimulation`

or right click on Engine & choose `Run`




