package weather;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WeatherWS")
public class WeatherWS {

    @WebMethod(operationName = "getWeather")
    public String getWeather(@WebParam(name = "city") String city) {

        // Simulated weather data
        if (city.equalsIgnoreCase("Mumbai")) {
            return "City: Mumbai | Temp: 32°C | Humidity: 80% | Condition: Humid";
        } else if (city.equalsIgnoreCase("Delhi")) {
            return "City: Delhi | Temp: 41°C | Humidity: 45% | Condition: Hot and Sunny";
        } else if (city.equalsIgnoreCase("Pune")) {
            return "City: Pune | Temp: 28°C | Humidity: 60% | Condition: Pleasant";
        } else if (city.equalsIgnoreCase("Chennai")) {
            return "City: Chennai | Temp: 35°C | Humidity: 75% | Condition: Warm and Humid";
        } else if (city.equalsIgnoreCase("Kolkata")) {
            return "City: Kolkata | Temp: 30°C | Humidity: 70% | Condition: Cloudy";
        } else {
            return "City: " + city + " | Weather data not available";
        }
    }

    @WebMethod(operationName = "getTemperature")
    public String getTemperature(@WebParam(name = "city") String city) {

        if (city.equalsIgnoreCase("Mumbai")) {
            return "32°C";
        } else if (city.equalsIgnoreCase("Delhi")) {
            return "41°C";
        } else if (city.equalsIgnoreCase("Pune")) {
            return "28°C";
        } else if (city.equalsIgnoreCase("Chennai")) {
            return "35°C";
        } else if (city.equalsIgnoreCase("Kolkata")) {
            return "30°C";
        } else {
            return "Data not available";
        }
    }

    @WebMethod(operationName = "getCondition")
    public String getCondition(@WebParam(name = "city") String city) {

        if (city.equalsIgnoreCase("Mumbai")) {
            return "Humid";
        } else if (city.equalsIgnoreCase("Delhi")) {
            return "Hot and Sunny";
        } else if (city.equalsIgnoreCase("Pune")) {
            return "Pleasant";
        } else if (city.equalsIgnoreCase("Chennai")) {
            return "Warm and Humid";
        } else if (city.equalsIgnoreCase("Kolkata")) {
            return "Cloudy";
        } else {
            return "Unknown";
        }
    }
}