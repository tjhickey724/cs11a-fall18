public class FactorialDemo {
  public static void main(String[] args){
    int k = 10;
    double f = factorial(k);
    System.out.printf("%d factorial is %g%n",k,f);
  }
  public static double factorial(int n){
    if (n<=1){
      return 1d;
    } else {
      double f = factorial(n-1); // recursive call
      return n*f;
    }
  }
}
