/**
the provides functions related to the windchill formula
*/
public class WindChillRefactored{

  /**
  ask the user for temperature and wind speed and report on windChill
  @param args the command line arguments, which are ignored
  */
  public static void main(String[] args){
    System.out.print("Enter the temperature in degrees F: ");
    double temp = TextIO.getlnDouble();
    System.out.print("Enter the wind speed in mph: ");
    double vel = TextIO.getlnDouble();
    double wc = windChill(temp,vel);
    System.out.printf("The windchill is %.2f %n",wc);
  }

  /**
  calculate the windChill from the temperature and wind speed
  <p>
  Uses the formula from 
  <a href="https://en.wikipedia.org/wiki/Wind_chill">
  https://en.wikipedia.org/wiki/Wind_chill
  </a>
  </p>
  @param temp current temperature in degrees F as a double
  @param vel wind speed in mph as a double
  @return the windChill temperature in degrees F as a dounle
  */
  public static double windChill(double temp, double vel){
    double velPower = Math.pow(vel,0.16);
    double wcTemp
                  = 35.74
                  +  0.6215 * temp
                  - 35.75   * velPower
                  +  0.4275 * temp * velPower;
    return wcTemp;
  }
}
