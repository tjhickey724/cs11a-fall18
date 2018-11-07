public class EmailParse{
  public static void main(String[] args){
    System.out.println("Enter an email address:");
    String email = TextIO.getlnWord();
    int a = email.indexOf(".");
    int b = email.indexOf("@");
    String first = email.substring(0,a);
    String last = email.substring(a+1,b);
    String domain = email.substring(b+1);
    System.out.println("first name: "+first);
    System.out.println("last name: "+last);
    System.out.println("domain: "+domain);
  }
}
