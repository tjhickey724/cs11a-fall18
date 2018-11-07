public class BinarySortDemo {
  public static void main(String[] args){
    int[] data = {1,3,4,7,8,10,11,12};
    for(int val=0; val<15; val++){
      int result = binarySearch(data,val);
      System.out.printf("%3d %3d%n",val,result);
    }
  }

  public static int binarySearch(int[] data, int val){
    return binarySearchSublist(data,val,0,data.length);
  }

  public static int binarySearchSublist(int[] data, int val, int from, int to){
    if (to-from==0){
      // the sublist is empty and doesn't contain val
      return -(to+1);
    } else if (data[from]==val) {
      // the sublist starts with val
      return from;
    } else if (to-from==1){
      // the sublist has one element which isn't equal to val
      int pos = (data[from]>val)?from:to;
      return -(pos+1); 
    } else {
      int mid = (from+to)/2;
      if (val < data[mid]) {
        // look in the smaller half for val
        return binarySearchSublist(data,val,from,mid);
      } else {
        // look in the bigger half for val
        return binarySearchSublist(data,val,mid,to);
      }
    }
  }
}
