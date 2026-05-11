package currency;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CurrencyWS {

    @WebMethod
    public double convertCurrency(double amount, String from, String to) {

        if(from.equalsIgnoreCase("USD")
                && to.equalsIgnoreCase("INR")) {

            return amount * 83;
        }

        else if(from.equalsIgnoreCase("INR")
                && to.equalsIgnoreCase("USD")) {

            return amount / 83;
        }

        else if(from.equalsIgnoreCase("USD")
                && to.equalsIgnoreCase("EUR")) {

            return amount * 0.92;
        }

        else if(from.equalsIgnoreCase("EUR")
                && to.equalsIgnoreCase("USD")) {

            return amount * 1.08;
        }

        else {
            return 0;
        }
    }
}