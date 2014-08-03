name := "incidents-transports"

version := "1.0-SNAPSHOT"

resolvers += "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/" 

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "reactivemongo" % "0.10.0",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2",
  cache
)     

play.Project.playScalaSettings ++ patience.assets.StylusPlugin.stylusSettings


