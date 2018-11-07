
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextLib{

  public static String readFileAsString(String filename){
    try {
      return new String(Files.readAllBytes(Paths.get(filename)));
    } catch(Exception e){
      return "ERROR: "+e.getMessage();
    }
  }

  public static String[] splitIntoWords(String s){
    return s.split("[^a-zA-Z'-]+");
  }


  public static void testLib(){
    String contents = readFileAsString("RJ.txt");
    String[] lines = contents.split("\\n");
    String[] words = splitIntoWords(contents);
    System.out.printf("%n The first 200 words of Romeo and Juliet are: %n%n");
    for(int i=0;i<200; i++) {
      System.out.printf(words[i]+" ");
    }
    System.out.printf("%n%nRJ.txt length is "+contents.length()+"%n");
    System.out.printf("RJ contains %d words%n",words.length);
    System.out.printf("RJ contains %d lines%n%n",lines.length);
  }

  public static void main(String[] args){
    testLib();
  }

}
