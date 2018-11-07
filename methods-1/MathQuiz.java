

/**
MathQuiz  generates multiplication problems for the user and tests correctness
*/
public class MathQuiz{

  /**
    main repeatedly asks the user if they want a mulitiplication question
    and generates questions until they want to stop
  */
  public static void main(String[] args){
    System.out.print("Do you want a math question? ");
    boolean doAnother = TextIO.getlnBoolean();
    while (doAnother){
      giveMultProblem();
      System.out.print("another? ");
      doAnother = TextIO.getlnBoolean();
    }
  }

  /**
    giveMultProblem() - generates a multiplication problem x*y
    where x and y are random integers in the range 0-20 inclusive
  */
  public static void giveMultProblem(){
    java.util.Random rand = new java.util.Random(); // nice class for randomness

    int x = rand.nextInt(20); // generate a random int in the range 0-20
    int y = rand.nextInt(20);

    System.out.printf("What is %d * %d: ",x,y);
    int answer = TextIO.getlnInt();
    if (answer==x*y){
      System.out.print("You are correct!  ");
    } else {
      System.out.print("Sorry, that's not correct.  ");
    }
  }

}
