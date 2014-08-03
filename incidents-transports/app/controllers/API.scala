package controllers

import play.api._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.functional.syntax._
import play.api.libs.json._
import scala.concurrent.Future

// Reactive Mongo imports
import reactivemongo.api._

// Reactive Mongo plugin, including the JSON-specialized collection
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection

import domain.models._

import domain.models.JsonFormats._

object LineController extends Controller with MongoController {

	def collection = db.collection[JSONCollection]("lines")

	def findAll = Action.async {
		// let's do our query
	    val cursor: Cursor[Line] = collection.
	      // find all
	      find(Json.obj()).
	      // sort them by creation date
	      //sort(Json.obj("created" -&gt; -1)).
	      // perform the query and get a cursor of JsObject
	      cursor[Line]
	    // gather all the JsObjects in a list

	    cursor.collect[List]().map { lines =>
	    	Ok(Json.toJson(lines)) 
	    }
	}

}