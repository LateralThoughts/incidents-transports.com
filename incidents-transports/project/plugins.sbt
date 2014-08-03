// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.3")

// play stylus
resolvers += "Patience Releases" at "http://repo.patience.io/"

addSbtPlugin("patience" % "play-stylus" % "1.0.0")