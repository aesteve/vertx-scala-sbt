import sbt._

object Version {
  final val Scala           = "2.11.8"
  final val ScalaTest       = "2.2.6"
  final val Vertx           = "3.4.0-SNAPSHOT"
  final val VertxLangScala  = "3.4.0-SNAPSHOT"
}

object Library {
  val vertxCodegen   = "io.vertx"       %  "vertx-codegen"    % Version.VertxLangScala % "provided" changing()
  val vertxLangScala = "io.vertx"       %% "vertx-lang-scala" % Version.VertxLangScala              changing()
  val vertxWeb       = "io.vertx"       %% "vertx-web-scala"  % Version.VertxLangScala              changing()
  val scalaTest      = "org.scalatest"  %% "scalatest"        % Version.ScalaTest                   changing()
}
