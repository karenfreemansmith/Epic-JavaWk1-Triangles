import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();

    Triangles userTriangle = new Triangles();

    float sideA = Float.parseFloat(c.readLine("Enter side 1: "));
    float sideB = Float.parseFloat(c.readLine("Enter side 2: "));
    float sideC = Float.parseFloat(c.readLine("Enter side 3: "));

    if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isEquilateral(sideA, sideB, sideC)) {
      System.out.println("Your triangle is an equilateral triangle.");
    } else if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isIsosceles(sideA, sideB, sideC)) {
      System.out.println("Your triangle is an isosceles triangle.");
    } else if(userTriangle.isTriangle(sideA, sideB, sideC)&&userTriangle.isScalene(sideA, sideB, sideC)) {
      System.out.println("Your triangle is an scalene triangle.");
    } else {
      System.out.println("Sorry, that is not a triangle!");
    }
  }
}
