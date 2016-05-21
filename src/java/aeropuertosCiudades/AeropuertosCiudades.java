/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertosCiudades;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;

/**
 *
 * @author gmgarcia
 */
@WebService(serviceName = "AeropuertosCiudades")
public class AeropuertosCiudades {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "obtenerAeropuestosCiudades")
    public String[] obtenerAeropuestosCiudades(@WebParam(name = "pais") String pais) {
    // se crea cliente para servicio global weather
    GlobalWeather gw = new GlobalWeather();
    // se obtiene cliente soap
    GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
    // se llama a servicio
    // llamada se produce de manera síncrona, por lo que el retorno
    // queda en variable cities
    String cities = gwSoap.getCitiesByCountry(pais);
    
    Airport ap = new Airport();
    AirportSoap apSoap = ap.getAirportSoap();
    // obtenemos la nfomracion de los aeropuertos del pais
    String aeropuertos = apSoap.getAirportInformationByCountry(pais);
    
    String[] retorno = new String[2];
    retorno[0] = cities;
    retorno[1] = aeropuertos;   
    return retorno;
  }
}

