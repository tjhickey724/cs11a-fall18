import java.util.Scanner;

public class ScanDemo {
  public static void main(String[] args){
    readLineFromConsole();
    readLineFromConsole();
  }

  public static void readLineFromConsole(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a word, an int, and a double: ");
    String s = scan.next();
    int x = scan.nextInt();
    double y = scan.nextDouble();
    String rest = scan.nextLine();
    System.out.printf("You entered x=%d y=%f s=\"%s\"%n",x,y,s);
    System.out.printf("The rest of the line was \"%s\"%n",rest);
  }
}
