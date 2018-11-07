/**
ConvertToBinary
This program asks for a positive integer n and generates the binary representation
by calculating the last bit using an even/odd test repeatedly.
*/
public class ConvertToBinary {
  public static void main(String[] args){
    System.out.println("Enter a positive integer n:");
    int val = TextIO.getlnInt();
    String s = "";
    int n = val;
    while (n > 0) {
      int lastbit = (n%2);
      n = n/2;
      s = ""+lastbit+s;
    }
    System.out.printf("%d base 10 is %s base 2%n",val,s);
  }
}
