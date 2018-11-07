public class CountZeroes {
  public static void main(String[] args){
    int[] data = {4,2,0,2,-1,0,0,-8,9,0,3,-1,6};
    int numZeroes = countZeros(data);
    System.out.printf("%s has %d zeroes %n",
      java.util.Arrays.toString(data),
      numZeroes);
    int total = sumPositives(data);
    System.out.printf("The sum of pos nums is %d%n",total);
  }

  public static int countZeros(int[] intArray){
    int counter = 0;
    for(int i=0; i<intArray.length; i++){
      if (intArray[i]==0){
        counter++;
      }
    }
    return counter;
  }


}
