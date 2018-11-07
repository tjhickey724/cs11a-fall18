import java.util.List;

public class Weather{
  MainJson main;
  WindJson wind;
  List<WeatherJson> weather;
}

class MainJson {
  double temp;
  double humidity;
  double pressure;
}

class WindJson {
  double speed;
  double deg;
}

class WeatherJson {
  String description;
  String main;
}
