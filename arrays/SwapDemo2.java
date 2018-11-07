public class SwapDemo2 {
  public static void main(String[] args){
    int[] data = {10,20,30};
    System.out.printf("before :%n%s%n",java.util.Arrays.toString(data));
    int a = data[0];
    int b = data[2];
    int tmp=a;
    a=b;
    b=tmp;
    System.out.printf("after 1:%n%s%n",java.util.Arrays.toString(data));
    tmp = data[0];
    data[0]=data[2];
    data[2]=tmp;
    System.out.printf("after 2:%n%s%n",java.util.Arrays.toString(data));
  }
}
