public class SwapDemo {
  public static void main(String[] args){
    int[] data = {10,20,30};
    System.out.printf("before :%n%s%n",java.util.Arrays.toString(data));
    swap1(data[0],data[2]);
    System.out.printf("after 1:%n%s%n",java.util.Arrays.toString(data));
    swap2(data,0,2);
    System.out.printf("after 2:%n%s%n",java.util.Arrays.toString(data));
  }
  public static void swap1(int a, int b){
    int tmp = a;
    a = b;
    b = tmp;
  }
  public static void swap2(int[] data, int i, int j){
    int tmp = data[i];
    data[i]=data[j];
    data[j]=tmp;
  }
}
