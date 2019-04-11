version := "0.1"

scalaVersion := "2.13.0-M5"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,

  "org.mockito" %% "mockito-scala" % "1.3.0"
)
