public class Interest{
  public static void main(String[] args){
    System.out.println("Enter the principle: ");
    double principal = TextIO.getlnDouble();
    System.out.println("Enter the annual interest, e.g. 0.07 is 7 percent: ");
    double interest = TextIO.getlnDouble();
    System.out.println("How many years do you want to invest? ");
    int years = TextIO.getlnInt();

    double value = principal;
    // insert your code here to print out the new principal for each of the years

    System.out.println("bye");
  }
}
