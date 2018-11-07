/**
  Concordance
  This program accepts a filename as a command line argument
  and asks the user for a word, then it prints out every word
  in the file which contains that line.
*/
public class Concordance {
  public static void main(String[] args){
    System.out.println("Concordance generator");

    String filename = "RandJ.txt";
    String word = "change";
    if (args.length > 1){
      filename = args[0];
      word = args[1];
    } else {
      System.out.println("usage: java Concordance FILENAME WORD");
      System.out.println("we assume you are looking for 'change' in Romeo and Juliet");
    }

    TextIO.readFile(filename); // start reading from the file!

    String line = "";
    while (!TextIO.eof()){
      line = TextIO.getln();
      if (line.contains(word)){
        System.out.println(line);
      }
    }
  }
}
