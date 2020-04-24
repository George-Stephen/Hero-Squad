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

        get("/categories", (request, response) -> {
            Map<String, ArrayList<Squad>> model = new HashMap<>();
            ArrayList myRectangleArrayList = Squad.getmInstances();
            model.put("myRectangles", myRectangleArrayList);
            return new ModelAndView(model, "Categories.hbs");
        }, new HandlebarsTemplateEngine());
        }


    }
}