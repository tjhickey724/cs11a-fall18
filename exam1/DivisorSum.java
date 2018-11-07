public class DivisorSum {
  public static void main(String[] args){
    System.out.print("Enter n: ");
    int n = TextIO.getlnInt();

    int sum=0;
    for(int i=1; i<=n; i++){
      if (n%i==0){
        sum += i;
      }
    }
    System.out.printf("The sum of the divisors of %d is %d%n",
       n,sum);
  }
}
