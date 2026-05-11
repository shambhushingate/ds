
package currency;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the currency package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConvertCurrencyResponse_QNAME = new QName("http://currency/", "convertCurrencyResponse");
    private final static QName _ConvertCurrency_QNAME = new QName("http://currency/", "convertCurrency");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: currency
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertCurrencyResponse }
     * 
     */
    public ConvertCurrencyResponse createConvertCurrencyResponse() {
        return new ConvertCurrencyResponse();
    }

    /**
     * Create an instance of {@link ConvertCurrency }
     * 
     */
    public ConvertCurrency createConvertCurrency() {
        return new ConvertCurrency();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currency/", name = "convertCurrencyResponse")
    public JAXBElement<ConvertCurrencyResponse> createConvertCurrencyResponse(ConvertCurrencyResponse value) {
        return new JAXBElement<ConvertCurrencyResponse>(_ConvertCurrencyResponse_QNAME, ConvertCurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currency/", name = "convertCurrency")
    public JAXBElement<ConvertCurrency> createConvertCurrency(ConvertCurrency value) {
        return new JAXBElement<ConvertCurrency>(_ConvertCurrency_QNAME, ConvertCurrency.class, null, value);
    }

}
