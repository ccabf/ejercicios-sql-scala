ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "ejercicios-sql-scala"
  )
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.29"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.6.0"