
package weatherclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the weatherclient package. 
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

    private final static QName _GetConditionResponse_QNAME = new QName("http://weather/", "getConditionResponse");
    private final static QName _GetTemperature_QNAME = new QName("http://weather/", "getTemperature");
    private final static QName _GetWeatherResponse_QNAME = new QName("http://weather/", "getWeatherResponse");
    private final static QName _GetTemperatureResponse_QNAME = new QName("http://weather/", "getTemperatureResponse");
    private final static QName _GetWeather_QNAME = new QName("http://weather/", "getWeather");
    private final static QName _GetCondition_QNAME = new QName("http://weather/", "getCondition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: weatherclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCondition }
     * 
     */
    public GetCondition createGetCondition() {
        return new GetCondition();
    }

    /**
     * Create an instance of {@link GetTemperatureResponse }
     * 
     */
    public GetTemperatureResponse createGetTemperatureResponse() {
        return new GetTemperatureResponse();
    }

    /**
     * Create an instance of {@link GetWeather }
     * 
     */
    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    /**
     * Create an instance of {@link GetConditionResponse }
     * 
     */
    public GetConditionResponse createGetConditionResponse() {
        return new GetConditionResponse();
    }

    /**
     * Create an instance of {@link GetTemperature }
     * 
     */
    public GetTemperature createGetTemperature() {
        return new GetTemperature();
    }

    /**
     * Create an instance of {@link GetWeatherResponse }
     * 
     */
    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getConditionResponse")
    public JAXBElement<GetConditionResponse> createGetConditionResponse(GetConditionResponse value) {
        return new JAXBElement<GetConditionResponse>(_GetConditionResponse_QNAME, GetConditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getTemperature")
    public JAXBElement<GetTemperature> createGetTemperature(GetTemperature value) {
        return new JAXBElement<GetTemperature>(_GetTemperature_QNAME, GetTemperature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getWeatherResponse")
    public JAXBElement<GetWeatherResponse> createGetWeatherResponse(GetWeatherResponse value) {
        return new JAXBElement<GetWeatherResponse>(_GetWeatherResponse_QNAME, GetWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getTemperatureResponse")
    public JAXBElement<GetTemperatureResponse> createGetTemperatureResponse(GetTemperatureResponse value) {
        return new JAXBElement<GetTemperatureResponse>(_GetTemperatureResponse_QNAME, GetTemperatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getWeather")
    public JAXBElement<GetWeather> createGetWeather(GetWeather value) {
        return new JAXBElement<GetWeather>(_GetWeather_QNAME, GetWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather/", name = "getCondition")
    public JAXBElement<GetCondition> createGetCondition(GetCondition value) {
        return new JAXBElement<GetCondition>(_GetCondition_QNAME, GetCondition.class, null, value);
    }

}
