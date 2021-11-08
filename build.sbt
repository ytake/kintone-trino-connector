val trinoVersion = "364"
val airliftVersion = "208"

version := trinoVersion

scalaVersion := "2.13.7"

name := "kintone-trino-connector"

libraryDependencies ++= Seq(
  "com.kintone" % "kintone-java-client" % "1.2.0",
  "org.scala-lang" % "scala-library" % "2.13.7",
  "io.airlift" % "Bootstrap" % airliftVersion % "provided",
  "io.airlift" % "configuration" % airliftVersion % "provided",
  "io.airlift" % "json" % airliftVersion % "provided",
  "io.trino" % "trino-spi" % trinoVersion % "provided",
  "org.scalatest" %% "scalatest" % "3.2.7" % Test
)

// Target Java SE 11
scalacOptions += "-target:jvm-11"
javacOptions ++= Seq("-source", "11", "-target", "11", "-Xlint")

assembly / assemblyMergeStrategy := {
  case PathList("io", "trino", "spi", "license", "LicenseManager.class") => MergeStrategy.discard
  case PathList("META-INF", "services", "io.trino.spi.Plugin") => MergeStrategy.first
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

assemblyJarName := {
  s"${name.value}-${version.value}.jar"
}
