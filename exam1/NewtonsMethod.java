public class NewtonsMethod {
  public static void main(String[] args){
    double x;
    double g=1;
    double error=1;
    System.out.print("Enter a positive number: ");
    x = TextIO.getlnDouble();
    while (error> 0.00000_00000_00001){
      g = (g + x/g)/2;
      error = Math.abs(g*g-x);
      System.out.printf("guess=%.20f  error=%.20f%n",g,error);
    }
    System.out.printf("The square root of %f is approximately %.20f%n",x,g);

  }
}
