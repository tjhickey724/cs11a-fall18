import java.util.Arrays;
/**
* This is a demo of the mergeSort algorithm
*/
public class MergeSortDemo{

  public static void main(String[] args){
    int[] data = {8,7,6,5,4,3,2,1};
    System.out.printf("data=%s%n",Arrays.toString(data));
    mergeSort(data);
    System.out.printf("data=%s%n",Arrays.toString(data));
  }

  /**
  * This sorts a list by splittingit, sorting each half, and merging the results
  * This is one of the fastest sorts and in some sense is the fastest possible sort
  *
  */
  public static void mergeSort(int[] data){
    mergeSortSublist(data,0,data.length);
  }

  /**
  * Given a subset of a list from position "from" upto but not including "to"
  * this method will rearrange those elements so they are in sorted order
  * from lowest to highest
  * @param data the integer array
  * @param from the beginning of the sublist
  * @param to the end of the sublist (but not included in the sublist)
  * @return void it sorts the sublist in place
  */
  private static void mergeSortSublist(int[] data, int from, int to){
    if (to-from <= 1) {
      // this is the case where the subarray has 0 or 1 elements
      // and so it is already in order!
      return;
    } else {
      // here we split the list in two (roughly)
      // sort each half separately
      // then merge the two sorted subsublists together
      // into a big sorted sublist
      int mid = (from + to)/2;
      mergeSortSublist(data,from,mid);
      mergeSortSublist(data,mid,to);
      mergeSubLists(data,from,mid,to);
    }
  }

  /**
  * merges the two continguous sorted sublists
  *  data[from], data[from+1], ....., data[mid-1] and
  *  data[mid], data[mid+1], ...., data[to-1]
  * to form a sorted sublist in place.
  */
  private static void mergeSubLists(int[] data, int from, int mid, int to){
    int[] tmp = new int[to-from];
    int i=from;
    int j=mid;
    int k = 0;
    boolean done=false;
    while(!(i==mid && j==to)){
      if (i==mid){
        tmp[k++] = data[j++];
      } else if (j == to){
        tmp[k++] = data[i++];
      } else if (data[i]<data[j]){
        tmp[k++]=data[i++];
      } else {
        tmp[k++] = data[j++];
      }
    }
    System.out.printf("merge(data,%d,%d,%d) to-from= %d %n",from,mid, to,to-from);
    System.out.printf("data=%s%n",Arrays.toString(data));
    for(int m=0; m<to-from; m++){
      data[m+from] = tmp[m];
    }
    System.out.printf("data=%s%n%n",Arrays.toString(data));
  }
}
