public class SSNdemo{
  public static void main(String[] args){
    System.out.print("Enter a 9 digit SSN with no dashes or spaces: ");
    String ssn = TextIO.getlnWord();
    String a = ssn.substring(0,3);
    String b = ssn.substring(3,5);
    String c = ssn.substring(5);
    String ssn2 = a+"-"+b+"-"+c;
    System.out.println("Your formatted SSN is "+ssn2);
  }
}
