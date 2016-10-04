lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(NGPlugin)
  .settings(
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