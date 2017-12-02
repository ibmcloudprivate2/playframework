name := """play-javaapp"""
organization := "ibm.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

// setting a maintainer which is used for all packaging types
maintainer := "Jaric Sng"

// exposing the play ports
dockerExposedPorts in Docker := Seq(9000, 9443)
