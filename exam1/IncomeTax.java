public class IncomeTax {
  public static void main(String[] args){
    System.out.print("Enter your annual income: ");
    int income = TextIO.getlnInt();
    int rate=0;

    if (income <= 9_525) {
      rate = 10;
    } else if (income <= 38_700){
      rate = 12;
    } else if (income <= 82_500){
      rate = 22;
    } else if (income <= 157_500){
      rate = 24;
    } else if (income <= 200_000){
      rate = 32;
    } else if (income <= 500_000){
      rate = 35;
    } else {
      rate = 37;
    }

    System.out.printf("You marginal tax rate is: %d%%%n",rate);

  }
}
