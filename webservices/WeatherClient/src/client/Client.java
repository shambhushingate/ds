package client;

import weather.WeatherWS;
import weather.WeatherWSService;

public class Client {

    public static void main(String[] args) {

        WeatherWSService service =
                new WeatherWSService();

        WeatherWS proxy =
                service.getWeatherWSPort();

        System.out.println(
                proxy.getWeather("Pune")
        );

        System.out.println(
                proxy.getWeather("Mumbai")
        );

        System.out.println(
                proxy.getWeather("Delhi")
        );
    }
}