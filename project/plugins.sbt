addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.12")

// the reflection plugin is built with an older version of scalajs.
// Overriding the dependency removes the eviction warning in sbt.
dependencyOverrides += "org.scala-js" % "sbt-scalajs" % "0.6.12"

resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("com.augustnagro" % "sbt-scalajs-ng" % "0.0.1-SNAPSHOT")