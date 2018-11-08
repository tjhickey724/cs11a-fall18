import java.util.Scanner;
import java.io.File;

/**
This shows how to read an excel file as a 2d array of Strings
*/
public class StoreDemo {


  public static void main(String[] args){
    String[][] storeData = readData();
    writeData(storeData);
  }

  public static String[][] readData(){
    //Date,Time,Transaction,Item
    String[][] data = new String[20][4];
    try {
        String fileName = "test20.csv"; //"BreadBasket_DMS.csv";
        File file = new File(fileName);

        // next create a scanner to read from the file
        Scanner fileScanner = new Scanner(file);

        // now read the entire file and print it with line numbers:
        int row=0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            data[row++]= line.split(",");

        }
        fileScanner.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return data;
  }

  public static void writeData(String[][] data){
    String[] cols =
      {"Date","Time","Transaction","Item"};
    for(int i=0; i<data.length; i++){
      System.out.printf("%5d ",i);
      for(int j=0;j<4;j++){
        System.out.printf("%5s ",data[i][j]);
      }
      System.out.println();
    }
  }
}
