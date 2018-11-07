public class GoodMorning {
  public static void main(String[] args){
    System.out.print("Enter a language (English, Spanish, Japanese, German): ");
    String language = TextIO.getlnWord();
    String greeting = "Good Morning";
    switch(language){
      case "English": greeting = "Good Morning"; break;
      case "Spanish": greeting = "Buenas dias"; break;
      case "Japanese": greeting = "Ohiougozaimasu"; break;
      case "German": greeting = "Guten Morgan"; break;
      default: greeting = "... sorry, I don't know "+language;
    }
    System.out.printf("Good morning in %s is %s%n",language,greeting);
  }
}
