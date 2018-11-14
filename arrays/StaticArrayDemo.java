public class StaticArrayDemo {
  public static final int SIZE=5;
  public static int[] data = new int[SIZE];

  public static void main(String[] args){
    initData(); // notice we aren't passing a parameter or receiving a values
    printData();
  }
  public static void initData(){
    data[0]=1;
    data[SIZE-1]=1;
    for(int i=1; i<SIZE-1; i++){
      data[i] = data[i-1]*(SIZE-i)/i;}
  }

  public static void printData(){
    System.out.printf("%s%n",java.util.Arrays.toString(data));
  }
}
