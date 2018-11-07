public class ArrayLib {
  public static void main(String[] args){
    // tests go here
    double[] data={1d,5d,3d,6d,8d,7d};
    printArray(data);
    double theSum = sumArray(data);
    System.out.printf("sum=%.2f%n",theSum);
  }

  /**
  returns the sum of the elements in the Arrays
  */
  public static double sumArray(double[] data){
    double sum=0;
    for(int i=0; i<data.length; i++){
      sum += data[i];
    }
    return sum;
  }

  public static void printArray(double[] data){
    for(int i=0; i<data.length; i++){
      System.out.printf("%3d %.4f%n",i,data[i]);
    }
  }

}
