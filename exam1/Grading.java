public class Grading {
  public static void main(String[] args){
    System.out.println("Enter grades between 0 and 100");
    System.out.println("End with a -1");
    int pass=0;
    int fail=0;
    int grade=0;
    do {
      grade = TextIO.getlnInt();
      if (grade>=60){
        pass++;
      } else if (grade >=0){
        fail++;
      }
    } while(grade>=0);
    System.out.printf("Passes: %d%nFails: %d%n",pass,fail);
  }
}
