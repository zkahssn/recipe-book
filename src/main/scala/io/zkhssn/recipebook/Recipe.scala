package io.zkhssn.recipebook
import io.circe.{Decoder, Encoder}
import io.circe.generic.semiauto._

case class Recipe(id: Int, name: String, Ingredients: String, method: String)

object Recipe {

  implicit val decoder: Decoder[Recipe] = deriveDecoder
  implicit val encoder: Encoder[Recipe] = deriveEncoder

}
