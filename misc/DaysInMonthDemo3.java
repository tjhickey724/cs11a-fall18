public class DaysInMonthDemo3 {
  public static void main(String[] args){
    System.out.println("Enter a month (with 3 letters, e.g. jan, feb, mar, ...): ");
    String month = TextIO.getlnWord();
    int days;
    switch (month){
      case "jan":
      case "mar":
      case "may":
      case "jul":
      case "aug":
      case "oct":
      case "dec":
       days=31; break;
      case "feb":
       days=28; break;
      case "apr":
      case "jun":
      case "sep":
      case "nov":
       days=30; break;
      default: days=0;
    }

    if (days>0){
      System.out.printf("There are %d days in %s%n",days,month);
    } else {
      System.out.printf("I don't recognize the month %s%n",month);
    }

  }
}
