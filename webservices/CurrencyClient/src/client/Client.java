package client;

import currency.CurrencyWS;
import currency.CurrencyWSService;

public class Client {

    public static void main(String[] args) {

        CurrencyWSService service =
                new CurrencyWSService();

        CurrencyWS proxy =
                service.getCurrencyWSPort();

        double result1 =
                proxy.convertCurrency(
                        100,
                        "USD",
                        "INR"
                );

        double result2 =
                proxy.convertCurrency(
                        1000,
                        "INR",
                        "USD"
                );

        System.out.println(
                "100 USD to INR = " + result1
        );

        System.out.println(
                "1000 INR to USD = " + result2
        );
    }
}