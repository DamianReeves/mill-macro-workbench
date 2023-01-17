ThisBuild / scalaVersion := "3.2.1"

lazy val sandbox = (project in file("./sandbox"))
  .settings(
    name := "sandbox",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio-test" % "2.0.5",
      "dev.zio" %% "zio-test-sbt" % "2.0.5"
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
