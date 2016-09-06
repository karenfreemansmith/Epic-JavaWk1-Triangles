import org.junit.*;
import static org.junit.Assert.*;

public class TrianglesTest {

  @Test
  public void isTriangle_sidesConnect_boolean() {
    Triangles t = new Triangles();
    assertEquals(false, t.isTriangle(1,2,3));
    assertEquals(true, t.isTriangle(4,5,3));
  }
  @Test
  public void isScalene_sidesNotEqual_boolean() {
    Triangles t = new Triangles();
    assertEquals(true, t.isScalene(3,4,5));
  }
  @Test
  public void isIsosceles_twoSidesEqual_boolean() {
    Triangles t = new Triangles();
    assertEquals(true, t.isIsosceles(3,3,4));
  }
  @Test
  public void isEquilateral_sidesAllEqual_booelan() {
    Triangles t = new Triangles();
    assertEquals(true, t.isEquilateral(3,3,3));
  }
}
