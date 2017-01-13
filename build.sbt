import sbt._
import Dependencies._

organization := "org.addictive.science"
name := "timeline"
version := "0.0.1-SNAPSHOT"
scalaVersion in ThisBuild := "2.11.8"

ivyScala := ivyScala.value map {
  _.copy( overrideScalaVersion = true )
}

ivyScala := ivyScala.value map { _.copy( overrideScalaVersion = true ) }

resolvers in ThisBuild ++= Seq( "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
                                "Spray IO Repository" at "http://repo.spray.io/",
                                "Maven Central" at "https://repo1.maven.org/maven2/" )

lazy val root = ( project in file( "." ) ).aggregate( domainModel, services )

lazy val domainModel = ( project in file( "timeline-model" ) )
                              .settings( libraryDependencies ++= slf4j ++ logback )

lazy val services = ( project in file ("timeline-service" ) )
                              .settings( libraryDependencies ++= slf4j ++ logback )
                              .dependsOn( domainModel )
                              .enablePlugins( JavaAppPackaging )

