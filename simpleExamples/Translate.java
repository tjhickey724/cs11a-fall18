public class Translate {
  public static void main(String[] args){
    System.out.println("Enter a number (e.g. one, two, three, ...): ");
    String englishWord = TextIO.getlnWord();
    String japaneseWord;
    switch (englishWord){
      case "one": japaneseWord="ichi"; break;
      case "two": japaneseWord="ni"; break;
      case "three": japaneseWord="san"; break;
      case "four": japaneseWord="shi"; break;
      case "five": japaneseWord="go"; break;

      default: japaneseWord = "unknown";
    }

    System.out.println(englishWord+" translates to "+japaneseWord);

  }
}
