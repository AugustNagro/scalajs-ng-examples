lazy val root = project.in(file(".")).
  aggregate(quickstart, tourOfHeroes, displayingData, forms)

lazy val quickstart = project.
  enablePlugins(ScalaJSPlugin, NGPlugin).
  settings(commonSettings: _*)

lazy val tourOfHeroes = project.
  enablePlugins(ScalaJSPlugin, NGPlugin).
  settings(commonSettings: _*)


lazy val displayingData = project.
  enablePlugins(ScalaJSPlugin, NGPlugin).
  settings(commonSettings: _*)

lazy val forms = project.
  enablePlugins(ScalaJSPlugin, NGPlugin).
  settings(commonSettings: _*)

//lazy val dependencyInjection = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)

//lazy val templateSyntax = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val animations = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val attributeDirectives = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val componentStyles = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val hierarchialInjectors = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val httpClient = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val lifecycleHooks = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val pipes = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val routingAndNavigation = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val security = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val structuralDirectives = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)
//
//lazy val testing = project.
//  enablePlugins(ScalaJSPlugin, NGPlugin).
//  settings(commonSettings: _*)

lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.8",
  persistLauncher := true,
  resolvers += Resolver.sonatypeRepo("snapshots"),

  libraryDependencies ++= Seq(
    "com.augustnagro" %%% "scalajs-ng" % "0.0.1-SNAPSHOT",
    "org.scala-js" %%% "scalajs-dom" % "0.9.0",
    "com.lihaoyi" %%% "scalatags" % "0.6.0"
  )
)