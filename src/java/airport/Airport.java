/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import javax.jws.WebService;

/**
 *
 * @author gmgarcia
 */
@WebService(serviceName = "airport", portName = "airportSoap", endpointInterface = "net.webservicex.AirportSoap", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "WEB-INF/wsdl/Airport/www.webservicex.net/airport.asmx.wsdl")
public class Airport {

    public java.lang.String getAirportInformationByISOCountryCode(java.lang.String countryAbbrviation) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getAirportInformationByCityOrAirportName(java.lang.String cityOrAirportName) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getAirportInformationByCountry(java.lang.String country) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String getAirportInformationByAirportCode(java.lang.String airportCode) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
