/**
  CalcGCD finds the Greatest Common Divisor g of two numbers a and b
  using Euclid's algorithm
  and then uses that to find the Least Common Multiple as a*b/g
  It also counts the number of steps required by Euclid's algorithm. 
*/
public class CalcGCD{
  public static void main(String[] args){
    System.out.println("Enter two whole numbers, one per line: ");
    int num1 = TextIO.getlnInt();
    int num2 = TextIO.getlnInt();

    int n = num1;
    int m = num2;
    while (m>0){
      int tmp = n%m;
      n=m;
      m=tmp;
    }
    System.out.printf("The GCD of %d and %d is %d%n",num1,num2,n);

  }
}
