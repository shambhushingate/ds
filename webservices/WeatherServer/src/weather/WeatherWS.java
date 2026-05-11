package weather;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WeatherWS {

    @WebMethod
    public String getWeather(String city) {

        if(city.equalsIgnoreCase("Pune")) {
            return "Pune Weather: 28 Degree Celsius";
        }

        else if(city.equalsIgnoreCase("Mumbai")) {
            return "Mumbai Weather: 32 Degree Celsius";
        }

        else if(city.equalsIgnoreCase("Delhi")) {
            return "Delhi Weather: 35 Degree Celsius";
        }

        else {
            return "City not found";
        }
    }
}