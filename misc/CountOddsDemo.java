public class CountOddsDemo{
  public static void main(String[] args){
    int[] data = {1,2,3,7,8,9,2,4,3,3,1};
    int numOdds = countOdds(data);
    System.out.printf("%s has %d odds%n",
       java.util.Arrays.toString(data),
       numOdds);
  }

  public static int countOdds(int[] values){
    int counter = 0;
    for (int i=0; i<values.length; i++) {
      if (values[i] %2 != 0) {
        counter++;
      }
    }
    return counter;
  }

  public static int sum(int[] data){
    int s=0;
    for(int i=0;i<data.length;i++){
       s=s+data[i];
    }
    return s;
  }


}
