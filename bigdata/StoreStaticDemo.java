import java.util.Scanner;
import java.io.File;

/**
This shows how to read an excel file as a 2d array of Strings
*/
public class StoreStaticDemo {
  public static final String FILENAME="test20.csv";//"BreadBasket_DMS.csv";
  public static final int ROWS = 20;//21293

  // we represent the table as four columns of different types!
  public static String[] date = new String[ROWS];
  public static String[] time = new String[ROWS];
  public static int[] transaction = new int[ROWS];
  public static String[] item = new String[ROWS];


  public static void main(String[] args){
    readStaticData();
    writeStaticData();
  }

  public static void readStaticData(){
    //Date,Time,Transaction,Item
    try {
        File file = new File(FILENAME);

        // next create a scanner to read from the file
        Scanner fileScanner = new Scanner(file);

        // now read the entire file and print it with line numbers:
        int row=0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            // create a new Scanner just for this row!
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            // we read each of the four columns in this row
            date[row]=lineScanner.next();
            time[row] = lineScanner.next();
            transaction[row] = lineScanner.nextInt();
            item[row] = lineScanner.next();
            row++;
        }
        fileScanner.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
  }

  public static void writeStaticData(){
    for(int i=0; i<ROWS; i++){
      System.out.printf(
          "%5d %5s %5s %5d %5s%n",
          i,date[i], time[i], transaction[i],item[i]
          );

    }
  }
}
