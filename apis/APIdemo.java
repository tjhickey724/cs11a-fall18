
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
This is code modified from
https://crunchify.com/java-url-example-getting-text-from-url/

You need to download the gson classes from
https://search.maven.org/artifact/com.google.code.gson/gson/2.8.5/jar
and unzip it in the same folder as the APIdemo.java before compiling..

You also need an API key ...

Good example is with the weather API at
https://openweathermap.org/current
here's an example ...
"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"
which returns a JSON string containing weather info like temperature and wind windspeed

Compile this as
% javac -classpath ".:gson-2.8.5.jar" APIdemo.java
then run it as
% java -classpath ".:gson-2.8.5.jar" APIdemo

*/



import java.util.List;
import com.google.gson.Gson;

public class APIdemo {

	public static void main(String[] args) {
    getWeatherByZip(args);
  }

  /**
  the makes a call to openweathermap.com to get the weather data
  for the specified zipcode and the prints the info on the screen
  */
  public static void getWeatherByZip(String[] args){
    String zipcode = "02453";
    if (args.length == 1){
      zipcode = args[0];
    }
    Weather w = getWeather(zipcode);

    System.out.printf("Here is the weather info for %s%n%n",zipcode);
    System.out.printf("The current temperature is %.1f F ",k2f(w.main.temp));
    System.out.printf(" with %s %n",w.weather.get(0).description);
    System.out.printf(" and a wind speed of %.1f mph ", w.wind.speed);
    System.out.printf(" from direction %.1f degrees%n%n", w.wind.deg);
  }


  /**
  This gets the weather for a given zipcode...
  */
  public static Weather getWeather(String zipcode){
    //String apiKey = "b6907d289e10d714a6e88b30761fae22";
    String apiKey = "06d70799a9fcdfb5cffd48536349e502";
    String url = "https://api.openweathermap.org/data/2.5/weather?zip="+zipcode+",us"+"&appid="+apiKey;
    String json = getStringFromURL(url);
    Gson g = new Gson();
    Weather w = g.fromJson(json,Weather.class);
    return w;
    }



  /**
  * This is a method which will connect to a website and return the content as a string.
  * You can get information about time in different timezones by connecting
  * to the URL http://worldtimeapi.org/api/, e.g.
  * myURL="http://worldtimeapi.org/api/timezones/America/New_York.txt"
  * gives info about the current time in New York
  */
	public static String getStringFromURL(String myURL) {
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		}

		return sb.toString();
	}

  public static double k2c(double k){
    return k-273.15;
  }

  public static double k2f(double k){
    return k2c(k)*9/5+32;
  }

}
