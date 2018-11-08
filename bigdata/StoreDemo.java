import java.util.Scanner;
import java.io.File;

/**
This shows how to read an excel file as a 2d array of Strings
*/
public class StoreDemo {


  public static void main(String[] args){
    String[][] storeData = readData();
    writeData(storeData);
    int coffee = countCoffee(storeData);
    System.out.printf("%d coffees were bought%n",coffee);
  }

  public static int countCoffee(String[][] storeData){
    int counter =0;
    // you write this
    for(int i=0; i<storeData.length; i++){
      if(storeData[i][1].equals("Coffee")){
          counter++;
      }
    }
    return counter;
  }

  public static String[][] readData(){
    //Date,Time,Transaction,Item
    String[][] data = new String[21293][4];
    try {
        String fileName = "BreadBasket_DMS.csv";
        File file = new File(fileName);
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

    for(int i=0; i<data.length; i++){
      System.out.printf("%5d ",i);
      for(int j=0;j<data[i].length;j++){
        System.out.printf("%5s ",data[i][j]);
      }
      System.out.println();
    }
  }
}
