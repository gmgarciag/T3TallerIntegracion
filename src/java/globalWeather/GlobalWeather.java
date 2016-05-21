/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalWeather;

import javax.jws.WebService;

/**
 *
 * @author gmgarcia
 */
@WebService(serviceName = "GlobalWeather", portName = "GlobalWeatherSoap", endpointInterface = "net.webservicex.GlobalWeatherSoap", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "WEB-INF/wsdl/GlobalWeather/www.webservicex.net/globalweather.asmx.wsdl")
public class GlobalWeather {

    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getCitiesByCountry(java.lang.String countryName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
