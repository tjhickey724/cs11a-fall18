/**
HailstoneDemo
This prints the hailstone sequence starting from 7
or from a number passed in on the command line, if there is one.
*/
public class HailstoneDemo {
  public static void main(String[] args){
    System.out.println("This program prints the Hailstone sequence");
    int a=7;
    if (args.length>=1){
      a = Integer.parseInt(args[0]);
    }

    System.out.printf("The Hailstone sequence starting with %d is:%n",a);
    while (a>1){
      System.out.printf("%10d%n",a);
      if (a%2==0){
        a = a/2;
      } else {
        a = 3*a+1;
      }
    }
  }
}
