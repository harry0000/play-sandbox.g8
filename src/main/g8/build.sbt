val commonSettings = Seq(
  organization := "$organization_$",
  licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT")),

  scalaVersion := "$scala_version$",
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint"
  )
)

lazy val root = project.in(file("."))
  .settings(commonSettings :_*)
  .settings(
    name := "$name$",
    description := "Play framework sandbox.",
    libraryDependencies ++= Seq(
      "org.scalatestplus.play" %% "scalatestplus-play" % "$scalatest_play_version$" % "test",
      "org.scalatest"          %% "scalatest"          % "3.0.3" % "test"
    )
  )
  .enablePlugins(PlayScala)
