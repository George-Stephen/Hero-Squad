import objects.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/squads", (request, response) -> {
            Map<String, ArrayList<Squad>> model = new HashMap<>();
            ArrayList Squads = Squad.getmInstances();
            model.put("Squads", Squads);
            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());
        get("/heroes", (request, response) -> {
            Map<String, ArrayList<Squad>> model = new HashMap<>();
            ArrayList Heroes = Hero.getmInstances();
            model.put("Heroes", Heroes);
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());
        get ("/squads/new",(request, response) -> {
            Map<String,Object> model = new HashMap <String,Object>() ;
            String squad_serial = request.queryParams("squad_serial");
            String squad_Name = request.queryParams("squad_Name");
            String leader = request.queryParams("leader");
            String cause = request.queryParams("cause");
            model.put("squad_serial", squad_serial);
            model.put("squad_Name", squad_Name);
            model.put("leader", leader);
            model.put("cause", cause);
            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());
        }

        }



