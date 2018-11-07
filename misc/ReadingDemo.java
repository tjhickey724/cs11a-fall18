
public class ReadingDemo {
  public static void main(String[] args){
    System.out.println("Reading demo");
    System.out.println("enter an integer x:");
    int x = TextIO.getlnInt();
    int y = x*x;
    System.out.println(x+" squared is "+y);

    System.out.println();

    System.out.println("Enter a decimal number f");
    double f = TextIO.getlnDouble();
    double c = (f-32)*5/9;
    System.out.println(f+" degrees F is "+c+" degrees C");
  }
}
