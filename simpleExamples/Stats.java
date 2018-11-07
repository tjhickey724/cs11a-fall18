/**
Stats reads a file of positive numbers and returns the average value.
The first number, n, in the file is the number of data values to read.
The program will be called by java Averages FILENAME.txt.
For example, to average the values 10,20,30 we would create a file containing
3
10
20
30
*/

public class Stats{
  public static void main(String[] args){
    // first we make sure there is at least one command line argument
    if (args.length==0) {
      // if not when print an error message and return to the shell
      System.out.println("You must supply a file name:  java Stats FILENAME.txt");
      return;
    }
    // if there is an argument, we try to read from it
    // all TextIO.getlnZZZZ() that appear after this will read from the file ...

    TextIO.readFile(args[0]);

    double sum = 0;
    int n = TextIO.getlnInt();  // read the number of data in the file
    for(int i=1; i<=n; i=i+1){
      double val = TextIO.getlnDouble();
      sum = sum + val;
    }
    double avg = sum/n;
    System.out.printf("The sum, S, is %.2f%n",sum);
    System.out.printf("The average of the %d numbers is %.2f%n",n,avg);
  }
}
