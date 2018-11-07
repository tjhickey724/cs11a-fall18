import java.util.Scanner;

public class NewtonsMethodRec {
  public static void main(String[] args){
    double x;
    double g=1;
    double error=1;
    System.out.print("Enter a positive number: ");
    Scanner scanner = new Scanner(System.in);
    x = scanner.nextDouble();
    double sqrt = findSqrt(g,x);
    System.out.printf("The square root of %f is approximately %.20f%n",x,sqrt);

  }

  public static double findSqrt(double g, double x){
    System.out.printf("findSqrt(%.20g,%g)%n",g,x);
    if (Math.abs(g*g-x)<0.00000_00000_001*g) {
      return g;
    } else {
      return findSqrt(0.5*(g+x/g),x);
    }
  }
}
