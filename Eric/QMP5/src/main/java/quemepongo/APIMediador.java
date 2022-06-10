package quemepongo;

import java.util.Map;

public class APIMediador implements ServicioMeteorologico{
    AccuWeatherApi apiClima=new AccuWeatherApi();

  @Override
  public Integer getTemperatura() {
    Map<String, Object> hashTemperatura = (Map<String, Object>)apiClima
        .getWeather("Buenos Aires, Argentina")
        .get(0)
        .get("Temperature");
    return (Integer) hashTemperatura.get("Value");
  }

}
