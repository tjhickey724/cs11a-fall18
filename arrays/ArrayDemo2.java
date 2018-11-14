public class ArrayDemo2{
  public static final int SIZE = 10;
  public static void main(String[] args){
    int[] data = new int[SIZE];
    for(int i=0; i<SIZE; i++){
      data[i] = i;
    }
    System.out.printf("%s%n",java.util.Arrays.toString(data));
  }
}
