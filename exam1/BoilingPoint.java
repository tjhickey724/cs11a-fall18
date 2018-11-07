/**
BoilingPoint calculates the Boiling Point of water based on the altitude
using the formula from this website:
  https://www.omnicalculator.com/chemistry/boiling-point-altitude
*/
public class BoilingPoint {
  public static void main(String[] args){
    boolean tryAgain;
    do {
      System.out.println("Enter the altitude (in feet above sea level): ");
      double altitude = TextIO.getlnDouble();
      double pressure = 29.921 * Math.pow(1-0.0000068753*altitude,5.2559);
      double boilingPoint = 49.151*Math.log(pressure) + 44.932;
      System.out.println("The boiling point is "+boilingPoint);
      System.out.println("Try another?");
      tryAgain = TextIO.getlnBoolean();
    } while(tryAgain);
    System.out.println("bye");
  }
}
