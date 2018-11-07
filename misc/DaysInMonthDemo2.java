public class DaysInMonthDemo2 {
  public static void main(String[] args){
    System.out.println("Enter a month (with 3 letters, e.g. jan, feb, mar, ...): ");
    String month = TextIO.getlnWord();
    int days;
    switch (month){
      case "jan": days=31; break;
      case "feb": days=28; break;
      case "mar": days=31; break;
      case "apr": days=30; break;
      case "may": days=31; break;
      case "jun": days=30; break;
      case "jul": days=31; break;
      case "aug": days=31; break;
      case "sep": days=30; break;
      case "oct": days=31; break;
      case "nov": days=30; break;
      case "dec": days=31; break;
      default: days=0;
    }
  
    if (days>0){
      System.out.printf("There are %d days in %s%n",days,month);
    } else {
      System.out.printf("I don't recognize the month %s%n",month);
    }

  }
}
