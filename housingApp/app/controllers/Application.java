package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {
  
	static Form<HousingForm> housingForm = Form.form(HousingForm.class);

    public static Result index() {
        return ok(index.render("Hello"));
    }
    
    public static Result newTask() {
    	return TODO;
    }
  
    
    public static Result login() {
    	return TODO;
    }
}
