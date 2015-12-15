package controllers

import play.api.mvc._

class Application extends Controller {
  def index(payload: Option[String]) = Action { implicit request =>
      Ok(views.html.index())
  }
}
