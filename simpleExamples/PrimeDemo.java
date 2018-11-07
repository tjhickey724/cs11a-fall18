/**
PrimeDemo determines whether a number is prime or not.
If it isn't prime, it prints out the smallest divisor.
*/
public class PrimeDemo {
  public static void main(String[] args){
    System.out.println("Enter a positive integer");
    int n = TextIO.getlnInt();
    for(int i=2; i<=Math.sqrt(n); i++){
      if (n%i==0) {
        System.out.printf("%d is not prime%n it is %d * %d%n%n",n,i,n/i);
        return;
      }
    }
    System.out.printf("%d is prime%n",n);
  }
}
