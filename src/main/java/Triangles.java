public class Triangles {
  public boolean isTriangle (float a, float b, float c) {
    if((a+b>c)&&(b+c>a)&&(a+c>b)) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isScalene (float a, float b, float c) {
    if ((a!=b)&&(b!=c)&&(c!=a)) {
      return true;
    } else {
    return false;
    }
  }

  public boolean isIsosceles (float a, float b, float c) {
    if(a==b||b==c||a==c) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isEquilateral (float a, float b, float c) {
    if (a==b&&b==c) {
      return true;
    } else {
    return false;
    }
  }
}
