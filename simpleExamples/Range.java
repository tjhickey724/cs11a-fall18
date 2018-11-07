/**
Range reads a file and finds the largest and smallest numbers and their difference
*/

public class Range{
  public static void main(String[] args){
    // first we make sure there is at least one command line argument
    if (args.length==0) {
      // if not when print an error message and return to the shell
      System.out.println("You must supply a file name:  java Averages FILENAME.txt");
      return;
    }

    TextIO.readFile(args[0]);
    double val = TextIO.getlnDouble();
    double largestSoFar = val;
    while (!TextIO.eof()){
      val = TextIO.getlnDouble();
      if (val > largestSoFar){
        largestSoFar = val;
      }
    }
    System.out.printf("The largest number was %.2f%n",largestSoFar);
  }
}
