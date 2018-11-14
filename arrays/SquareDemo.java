import java.util.Arrays;
public class SquareDemo{
  public static void main(String[] args){
    double[] d = {5,1,2,3,7};
	 squareElts(d);
	 System.out.println(Arrays.toString(d));
  }
  public static void squareElts(double[] data){
    for(int i=0;i<data.length;i++){
      data[i] = data[i]*data[i];
    }
  }
}
