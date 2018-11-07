public class WindChillDemo{
  public static void main(String[] args){
    System.out.print("Enter the temperature in degrees F: ");
    double temp = TextIO.getlnDouble();
    System.out.print("Enter the wind speed in mph: ");
    double vel = TextIO.getlnDouble();
    double wc = WindChillRefactored.windChill(temp,vel);
    System.out.printf("The windchill is %.2f %n",wc);
  }
}
