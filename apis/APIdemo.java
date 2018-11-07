
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
which returns
{"coord":
  {"lon":-0.13,"lat":51.51},
 "weather":[{"id":300,"main":"Drizzle","description":"light intensity drizzle","icon":"09d"}],"base":"stations","main":{"temp":280.32,"pressure":1012,"humidity":81,"temp_min":279.15,"temp_max":281.15},"visibility":10000,"wind":{"speed":4.1,"deg":80},"clouds":{"all":90},"dt":1485789600,"sys":{"type":1,"id":5091,"message":0.0103,"country":"GB","sunrise":1485762037,"sunset":1485794875},"id":2643743,"name":"London","cod":200}

*/



import java.util.List;
import com.google.gson.Gson;

public class APIdemo {

	public static void main(String[] args) {
    //getURL(args);
    Weather w = getWeather("Boston,us");
    System.out.printf("windspeed = %f%n",w.wind.speed);
    System.out.printf("%n%n%nHere is the temperature%n%n");
    System.out.printf("t=%s  w=%s%n",w.main.temp,w.weather.get(0).description);

  }

  public static void getURL(String[] args){
    String data = callURL(args[0]);
		System.out.printf("%nOutput: %n >>>>>%n%s%n%n",data);
	}



	public static String callURL(String myURL) {
		System.out.println("Requeted URL:" + myURL);
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


  //    String json=
  // {'main':{'temp':270,'humidity':81,'pressure':1012},
  //  'wind':{'speed':4.1,'deg':80}
  // }
  public static Weather getWeather(String city){
    String url = "https://samples.openweathermap.org/data/2.5/weather?q="+city+"&appid=b6907d289e10d714a6e88b30761fae22";
    String json = callURL(url);
    //String json= "{'main':{'temp':270,'humidity':81,'pressure':1012},'wind':{'speed':4.1,'deg':80}}";
    Gson g = new Gson();
    Weather w = g.fromJson(json,Weather.class);
    //Data data = new Gson().fromJson(json, Data.class);
    // then we need to parse the JSON into GSON object w and pull out
    // w.weather.description
    // w.main.temp w.main.pressure w.main.humidity
    // w.wind.speed w.wind.deg
    //System.out.printf("%n%n%nHere is the temperature%n%n");
    //System.out.printf("t=%s  w=%s%n",w.main.temp,w.weather.get(0).description);
    return w;
  }

}
