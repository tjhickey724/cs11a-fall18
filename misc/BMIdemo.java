/**
  BMIdemo - this calculates the Body Mass Index
  and displays the results in various forms.
  @author Tim Hickey
  @version 0.0.1

*/
public class BMIdemo{

  /**
  main() tests some of the method calls
  */
  public static void main(String[] args){
    double w=165.0;
    double h=67.5;
    System.out.printf("weight=%.1f height=%.1f bmi=",w,h);
    printBMI(165.0,67.5);
    System.out.println();
  }

  /**
  *  printBMI calculates and prints the BMI from the weight and height
  *
  * @param weight the weight in pounds
  * @param height the height in inches
  */
  public static void printBMI(double weight, double height){
    double bmi = 703*weight/(height*height);
    System.out.printf("%6.1f",bmi);
  }


  public static void printBMI_loop(){
    System.out.printf("%6s%6s%n","weight","bmi");
    for(int i=-10; i<=10; i++){
      System.out.printf("%6d",165+i);
      printBMI(165.0+i,68.0);
      System.out.println();
    }
  }



  public static void printBMI_table(){
    printBMI_header();

    for(int w = 90; w<=200; w+=10){
      System.out.printf("%6d",w);
      for (int h=5*12; h<=6*12 ; h++) {
        printBMI(w,h);
      }
      System.out.println();
    }
  }

  public static void printBMI_header(){
    System.out.printf("      ");
    for (int h=5*12; h<=6*12 ; h++) {
      System.out.printf("%6d",h);
    }
    System.out.println();
  }



  public static void printInfo_loop(){
    for(int i=-10; i<=10; i++){
      printInfo(63,165.0+i,68,true,"Tim Hickey");
    }
  }

  public static void printInfo(int age, double weight, double height, boolean isMale, String name){
      double bmi = 703*weight/(height*height);
     System.out.printf("bmi=%5.1f age=%3d,  weight=%5.1f,  height=%3.1f isMale?=%b,  name=%s%n",bmi, age, weight, height,isMale,name);
  }

}
