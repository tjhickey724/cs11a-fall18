public class PhoneDemo{
  public static void main(String[] args){
    String tel; // the original number
    String formatted_tel; // the formatted number
    System.out.print("Enter a 10 digit US phone number with no dashes or spaces: ");
    tel = TextIO.getlnWord();
    String a = tel.substring(0,3);
    String b = tel.substring(3,6);
    String c = tel.substring(6);
    formatted_tel = "1-("+a+")-"+b+"-"+c;
    System.out.println("Your formatted phone number is "+formatted_tel);
  }
}
