
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
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

        staticFileLocation("/public");

        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            List<Squad> squads = Squad.getmInstances();
            List<Hero> heroes = Hero.getmInstances();
            model.put("Squads",squads);
            model.put("Heroes",heroes);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

         // Squads
        get("/Squads/new",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            List<Squad> squads = request.session().attribute("Squad");
            model.put("Squads",squads);
            return new ModelAndView(model,"squads.hbs");
        },new HandlebarsTemplateEngine());
        get("/Squads/form",(request, response) -> {
            Map<String,Object>model = new HashMap<>();
            return new ModelAndView(model,"Squad_Form.hbs");
        },new HandlebarsTemplateEngine());

        post("/Squads/new",(request, response) ->{
            Map<String,Object> model = new HashMap<>();
                String squad_Name = request.queryParams("name");
                String cause = request.queryParams("cause");
                int max = Integer.parseInt(request.queryParams("max"));
                Squad squad = new Squad(squad_Name,cause,max);
                request.session().attribute("Squad",Squad.getmInstances());
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());

        get("/Squad/Heroes/form",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            List<Squad> Squads = request.session().attribute("Squad");
            model.put("Squads",Squads);
           return new ModelAndView(model,"Hero_Form.hbs");
        }, new HandlebarsTemplateEngine());

        post("Squad/Heroes/new",(request, response) ->{
            Map<String,Object>model = new HashMap<>();
            List<Squad> Squads = new ArrayList<>();
            String Name = request.queryParams("Name");
            int Age = Integer.parseInt(request.queryParams("Age"));
            String Superpower = request.queryParams("Superpower");
            String Weakness = request.queryParams("Weakness");
            String Inputsquad = request.queryParams("squad");
            Squad newSquad = null;
            for ( Squad squad : Squads){
                if( squad.getSquad_Name().equals(Inputsquad)){
                   newSquad = squad ;
                   break;
                }
            }
            assert newSquad != null;
            Hero hero = new Hero(Name,Age,Superpower,Weakness,newSquad);
            request.session().attribute("Hero",Hero.getmInstances());
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());

        // heroes

        get("/Heroes/form", (request, response) ->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"Hero_Form.hbs");
        },new HandlebarsTemplateEngine());

        get("/Squad/Heroes/new",(request, response) ->{
            Map<String,Object>model = new HashMap<>();
            List<Hero> Heroes = request.session().attribute("Hero");
            model.put("Heroes",Heroes);
            return new ModelAndView(model,"hero.hbs");
        },new HandlebarsTemplateEngine());


    }


}





