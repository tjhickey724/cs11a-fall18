public class WindChill{
  public static void main(String[] args){
    System.out.print("Enter the temperature in degrees F: ");
    double temp = TextIO.getlnDouble();
    System.out.print("Enter the wind speed in mph: ");
    double vel = TextIO.getlnDouble();
    double wc = 35.74
                + 0.6215 * temp
                - 35.75 *  Math.pow(vel,0.16)
                + 0.4275 * temp * Math.pow(vel,0.16);
    System.out.printf("The windchill is %.2f %n",wc);
  }
}
