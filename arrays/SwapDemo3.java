public class SwapDemo3 {
  public static void main(String[] args){
    int a = 5;
    int b = 7;
    System.out.printf("a=%d b=%d%n",a,b);
    // swap values in a and b
    int tmp=a;
    a=b;
    b=tmp;
    System.out.printf("a=%d b=%d%n",a,b);
  }
}
