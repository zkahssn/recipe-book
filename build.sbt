name := "recipebook"

version := "0.1"

scalaVersion := "2.13.2"

enablePlugins(ScalaJSPlugin)
val http4sVersion = "0.21.2"
val circeVersion = "0.13.0"

// This is an application with a main method
//scalaJSUseMainModuleInitializer := true
libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-literal" % circeVersion
)
