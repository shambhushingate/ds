package weatherclient;

public class WeatherClient {
    public static void main(String[] args) {

        // Create service instance
       weatherclient.WeatherWS_Service service =
            new weatherclient.WeatherWS_Service();

        weatherclient.WeatherWS port =
            service.getWeatherWSPort();

        System.out.println("=========================================");
        System.out.println("       Weather Web Service Client         ");
        System.out.println("=========================================");

        // Test cities
        String[] cities = {"Mumbai", "Delhi", "Pune", "Chennai", "Kolkata", "Nagpur"};

        for (String city : cities) {
            System.out.println("\nFetching weather for: " + city);
            System.out.println("-----------------------------------------");
            System.out.println("Full Report  : " + port.getWeather(city));
            System.out.println("Temperature  : " + port.getTemperature(city));
            System.out.println("Condition    : " + port.getCondition(city));
        }

        System.out.println("\n=========================================");
        System.out.println("         Weather Report Complete          ");
        System.out.println("=========================================");
    }
}