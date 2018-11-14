public class FilterDemo {
  public static void main(String[] args){
    int[] data = {5,0,2,-3,2,-6,-1,2,0,4,8};
    int[] positives = filterPositives(data);
    System.out.printf("%s are the positives%n",
      java.util.Arrays.toString(positives));
    int[] below0 = filterBelow(data,0);
    System.out.printf("%s are the ones below 0",
      java.util.Arrays.toString(below0));
  }

  public static int[] filterBelow(int[] data, int val){

  }

  public static int[] filterPositives(int[] data){
    int[] positives = new int[data.length];
    int next = 0;
    for(int i=0;i<data.length;i++){
      if (data[i]>0){
        positives[next++] = data[i];
      }
    }
    int[] result = java.util.Arrays.copyOf(positives,next);
    return result;
  }

}
