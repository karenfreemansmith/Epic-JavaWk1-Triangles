import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    //Console c = System.console();

    Triangles userTriangle = new Triangles();


    // if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isEquilateral(sideA, sideB, sideC)) {
    //   System.out.println("Your triangle is an equilateral triangle.");
    // } else if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isIsosceles(sideA, sideB, sideC)) {
    //   System.out.println("Your triangle is an isosceles triangle.");
    // } else if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isScalene(sideA, sideB, sideC)) {
    //   System.out.println("Your triangle is an scalene triangle.");
    // } else {
    //   System.out.println("Sorry, that is not a triangle!");
    // }

    get("/", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      float sideA = Float.parseFloat(request.queryParams("sideA"));
      float sideB = Float.parseFloat(request.queryParams("sideA"));
      float sideC = Float.parseFloat(request.queryParams("sideA"));
      model.put("result", userTriangle.isTriangle(sideA, sideB, sideC));
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
