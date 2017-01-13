organization := "org.addictive.science"
name := "timeline-service"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.11.8"


enablePlugins( JavaAppPackaging )

mainClass in assembly := Some( "org.addictive.science.service.Main" )

assemblyMergeStrategy in assembly := {
  case PathList( "META-INF", "MANIFEST.MF" ) => MergeStrategy.discard
  case PathList( "reference.conf" ) => MergeStrategy.concat
  case x => MergeStrategy.first
}
