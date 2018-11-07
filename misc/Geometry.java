public class Geometry {
  // this will have no main method!!!!
  // it will be meant to be used from other classes

  /**
  triangle area from length of three sides
  */
  public static double triangleArea(double a, double b, double c){
    double s = (a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
  }

  /**
  cylinderVolume calculates the area of a cylinder
  from the radius r of its base and the height h using the formula pi r^2 h
  @param r the radius of the base of the cylinder (e.g. in inches)
  @param h the height of the cylinder (e.g. in inches)
  @return the volume of the cyliner (e.g. in cubic inches)
  */
  public static double cylinderArea(double r, double h){
    double area = Math.PI*r*r*h;
    return area;
  }

}
