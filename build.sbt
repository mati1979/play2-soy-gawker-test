name := "play2-soy-gawker-test"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.kinja.play" %% "play2-closure" % "0.24-2.2.1-SNAPSHOT"
)     

play.Project.playScalaSettings
