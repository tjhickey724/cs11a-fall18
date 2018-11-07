public class DaysInMonthDemo {
  public static void main(String[] args){
    System.out.println("Enter a month (with 3 letters, e.g. jan, feb, mar, ...): ");
    String month = TextIO.getlnWord();
    int days;
    if (month.equals("jan")){
      days=31;
    } else if (month.equals("feb")){
      days=28;
    }else if (month.equals("mar")){
      days=31;
    }else if (month.equals("apr")){
      days=30;
    }else if (month.equals("may")){
      days=31;
    }else if (month.equals("jun")){
      days=30;
    }else if (month.equals("jul")){
      days=31;
    }else if (month.equals("aug")){
      days=31;
    }else if (month.equals("sep")){
      days=30;
    }else if (month.equals("oct")){
      days=31;
    }else if (month.equals("nov")){
      days=30;
    }else if (month.equals("dec")){
      days=31;
    }else {
      days=0;
    }
    if (days>0){
      System.out.printf("There are %d days in %s%n",days,month);
    } else {
      System.out.printf("I don't recognize the month %s%n",month);
    }

  }
}
