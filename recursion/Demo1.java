public class Demo1{
  public static void main(String[] args){
    System.out.printf("Recursion Demo! %n");
    int n = 2;
    System.out.printf("calling demo from the main method with n=%d%n",n);
    demo(n);
    System.out.printf("finished calling demo from main!%n%n");
  }

  public static void demo(int n){
    System.out.printf("Entering demo(%d) %n",n);
    if (n<=0){
      System.out.printf("** Base case: n<=0 with n=%d %n",n);
    } else {
      System.out.printf("Calling demo(%d)%n",n-1);
      demo(n-1);
      System.out.printf("Returned from call of demo(%d)%n",n-1);
    }
    System.out.printf("Leaving demo(%d) %n",n);
  }
}
