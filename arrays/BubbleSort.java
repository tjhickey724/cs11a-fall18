/**
 * this implements the simplest bubble sort algorithm
 * and demonstrates it use on a simple array 
 */
public class BubbleSort{
  /**
  create a small array and print it before and after being bubblesorted
  */
  public static void main(String[] args){
    int[] data = {5,2,97,45,43,76,12,54,1,88,45,26,54,64,33};
    System.out.printf("before sort:%n     %s%n",java.util.Arrays.toString(data));
    sort(data);
    System.out.printf("after sort: %n     %s%n",java.util.Arrays.toString(data));
  }

  /**
  * sort the integer values in the array in place
  * @param data an integer Array
  * @return void
  */
  public static void sort(int[] data){
    for(int i=0; i<data.length; i++){
      swapAllPairs(data);
      System.out.printf("%3d  %s%n",i,java.util.Arrays.toString(data));
    }
  }

  /**
  * swap all adjacent pairs of positions (0,1),(1,2),...,(k-2,k-1) in the array
  * @param data an array of integers
  * @return void
  */
  private static void swapAllPairs(int[] data){
    for(int i=0; i<data.length-1; i++){
      if (data[i] > data[i+1]){
        swap(data,i,i+1);
      }
    }
  }

  /**
  * swap the values stored in positions i and j of an array
  * @param data the array being modified
  * @param i the first index
  * @param j the second index
  * @return void
  */
  public static void swap(int[] data, int i, int j){
    int tmp = data[i];
    data[i]=data[j];
    data[j]=tmp;
  }
}
