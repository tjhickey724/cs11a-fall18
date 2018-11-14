import java.util.Arrays;
public class WordLengthDemo {
  public static void main(String[] args){
    int[] wordLengths = findWordLengths(args);
    System.out.println(Arrays.toString(wordLengths));
  }
  public static int[] findWordLengths(String[] words){
    int[] lengths = new int[words.length];
    for(int i=0;i<words.length;i++){
      lengths[i] = words[i].length();
    }
    return lengths;
  }
}
