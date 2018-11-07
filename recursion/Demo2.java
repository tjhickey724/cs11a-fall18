public class Demo2{
  public static void main(String[] args){
    System.out.printf("Recursion Demo! %n");
    int n = 20000;
    System.out.printf("calling demo from the main method with n=%d%n",n);
    demo(1,n);
    System.out.printf("finished calling demo from main!%n%n");
  }

  public static void demo(int i, int n){
    int[] z = new int[10];
    System.out.printf("Entering demo(%d,%d) %n",i,n);
    if (n<=0){
      System.out.printf("** Base case: n<=0 with n=%d %n",n);
    } else {
      System.out.printf("Calling demo(%d)%n",n-1);
      demo(i+1,n-1);
      System.out.printf("Returned from call of demo(%d,%d)%n",i,n-1);
    }
    System.out.printf("Leaving demo(%d) %n",n);
  }
}
