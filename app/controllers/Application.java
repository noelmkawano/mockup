package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Infinity;
import views.html.Dance;
import views.html.Contacts;
import views.html.Multi;


/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns Infinity, a simple example of a second page to illustrate navigation.
   * @return The Infinity.
   */
  public static Result Infinity() {
    return ok(Infinity.render("Welcome to Infinity."));

  }

  /**
   * Returns Dance, a simple example of a second page to illustrate navigation.
   * @return The Dance.
   */
  public static Result Dance() {
    return ok(Dance.render("Welcome to Dance."));

  }

  /**
   * Returns Contacts, a simple example of a second page to illustrate navigation.
   * @return The Contacts.
   */
  public static Result Contacts() {
    return ok(Contacts.render("Welcome to Contacts."));

  }

  /**
   * Returns Multi, a simple example of a second page to illustrate navigation.
   * @return The Contacts.
   */
  public static Result Multi() {
    return ok(Multi.render("Welcome to Multi."));

  }

}
