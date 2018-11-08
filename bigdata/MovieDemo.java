import java.util.Scanner;
import java.io.File;

/**
This shows how to read an excel file as a 2d array of Strings
Alas, it got more complex than I wanted ... because of multiline plots
*/
public class MovieDemo {


  public static void main(String[] args){
    String[][] movieData = readMovieData();
    writeMovieData(movieData);
  }

  public static String[][] readMovieData(){
    //Release Year,Title,Origin/Ethnicity,Director,Cast,Genre,Wiki Page,Plot
    String[][] movieData = new String[12][8];
    try {
        String fileName = "test12.csv";
        File file = new File(fileName);

        // next create a scanner to read from the file
        Scanner fileScanner = new Scanner(file);

        // now read the entire file and print it with line numbers:
        int row=0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.printf("%n%n*******%njust read %d%n%s%n%n",row,line);
            movieData[row++]= processRow(line);

        }
        fileScanner.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return movieData;
  }

  /*
  * This doesn't quite work right.
  * The movie database stores the plot as a multiline string "...."
  * where all double quotes inside are doubled, i.e. written as ""
  * We need to modify the code to get this to work...
  */
  private static String[] processRow(String line){
    String[] movie = new String[8];
    for(int i=0; i<7; i++){
      int firstComma = line.indexOf(",");
      movie[i]= line.substring(0,firstComma);
      line = line.substring(firstComma+1);
    }
    movie[7] = line;  // the plot can contain commas!
    return movie;
  }

  public static void writeMovieData(String[][] movies){
    String[] cols =
      {"Release Year","Title,Origin/Ethnicity","Director","Cast","?","Genre","Wiki Page","Plot"};
    for(int i=0; i<movies.length; i++){
      for(int j=0;j<7;j++){
        System.out.printf("%22s: %s%n",cols[j],movies[i][j]);
      }
      System.out.printf("%22s: %s%n%n","Plot",movies[i][7]);
    }
  }
}
