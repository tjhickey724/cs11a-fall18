public class MaxDemo{
  public static void main(String[] args){
    double[] data = {1,4,2,6,3};
    System.out.println("max = "+findMax(data));
  }
  public static double findMax(double[] vals){
    double maxVal = vals[0]; // start off with first entry
    for(int i=1; i<vals.length; i++){
      if (vals[i]>maxVal) { maxVal = vals[i];}
    }
    return maxVal;
  }
}
