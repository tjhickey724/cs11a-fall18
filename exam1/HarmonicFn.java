public class HarmonicFn {
  public static void main(String[] args){
    System.out.print("Enter a positive integer n: ");
    int n = TextIO.getlnInt();
    double h=0;
    for(int i=1; i<=n; i++){
      h+= 1.0/i;
    }
    System.out.printf("H(%d) = 1/1 + 1/2 + 1/3 + ... + 1/%d = %f%n",n,h);
  }
}
