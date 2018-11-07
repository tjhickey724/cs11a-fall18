

/**
GenMathQuiz  generates multiplication problems for the user and tests correctness
*/
public class GenMathQuiz{

  /**
    main repeatedly asks the user if they want a multiplication question
    and generates questions until they want to stop
  */
  public static void main(String[] args){
    int numProblems = 10;
    for (int i=1; i<= numProblems; i++){
      System.out.printf("%d) ",i);
      showMultProblem();
      System.out.println("..........................................");
    }
  }

  /**
    showMultProblem() - generates a multiplication problem x*y
    where x and y are random integers in the range 0-20 inclusive
  */
  public static void showMultProblem(){
    java.util.Random rand = new java.util.Random(); // nice class for randomness

    int x = rand.nextInt(20); // generate a random int in the range 0-20
    int y = rand.nextInt(20);

    System.out.printf("What is %d * %d?  ________ %n",x,y);
  }

}
