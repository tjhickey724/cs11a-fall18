import java.util.Arrays;

public class ArrayDemo {
  public static void main(String[] args){
    int[] data = {4,2,5,7,6,2,8,23,54,23,68,774,34,25,44,8,12,21,7};
    System.out.println("data="+Arrays.toString(data));
    Arrays.sort(data);
    System.out.println("data="+Arrays.toString(data));
    System.out.println("Enter a number:");

    int val = TextIO.getlnInt();
    int pos = Arrays.binarySearch(data,val);
    if (pos>0){
      System.out.printf("pos of %d in array is %d%n",val,pos);
    } else {
      System.out.printf("%d is not in the array%n",val);
      System.out.printf("its position would be %d%n",-(pos+1));
    }

  }
}
