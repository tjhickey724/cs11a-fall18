public class StripVowels{
  public static void main(String[] args){
    System.out.println("Enter a line of text:");
    String line = TextIO.getln();

    for (int i=0;i<=line.length()-1;i++){
      char c = line. charAt(i);
      if ("aeiou".contains(""+c)){
        System.out.print("");
      }else{
        System.out.print(c);
      }
    }
    System.out.println();

  }
}
