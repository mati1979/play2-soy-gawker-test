package controllers

import play.api._
import play.api.mvc._
import com.kinja.play.plugins.Closure

object Application extends Controller {

  def index = Action {
    val styleSheet = routes.Assets.at("stylesheets/main.css").url
    val js = routes.Assets.at("javascripts/jquery-1.9.0.min.js").url

    Ok(Closure.html("example.index", Map("stylesheet" -> styleSheet, "js" -> js)))
  }

}
