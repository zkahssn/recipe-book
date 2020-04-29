package io.zkhssn.recipebook

import cats.effect._
import cats.implicits._
import io.zkhssn.recipebook.Recipe.encoder
import org.http4s.HttpRoutes
import org.http4s.circe.CirceEntityCodec._
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.server.blaze._

object Boot extends IOApp {

  def getRecipe(): IO[Recipe] =
    IO(Recipe(1, "Chips", "Potatoes", "Grill in the oven for 45 minutes"))

  val recipeService = HttpRoutes
    .of[IO] {
      case GET -> Root / "chips" =>
        getRecipe().flatMap(Ok(_))
    }
    .orNotFound

  def run(args: List[String]): IO[ExitCode] = {
    BlazeServerBuilder[IO]
      .bindHttp(8080, "localhost")
      .withHttpApp(recipeService)
      .serve
      .compile
      .drain
      .as(ExitCode.Success)
  }

}
