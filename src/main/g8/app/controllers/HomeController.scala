package controllers

import javax.inject._

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import play.twirl.api.Html

@Singleton
class HomeController @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

}
