package domain.models

case class Line(id: Int,
				name: String,
				aliases: List[String],
				city: String)

object JsonFormats {
  import play.api.libs.json.Json
  import play.api.data._
  import play.api.data.Forms._

  implicit val lineFormat = Json.format[Line]
}