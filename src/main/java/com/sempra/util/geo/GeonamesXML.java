package com.sempra.util.geo;

//~--- JDK imports ------------------------------------------------------------

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class GeonamesXML implements IGeonamesXML {
    public final static String COUNTRY_XML_FILE_URL = "http://api.geonames.org/countryInfo?username=afibarra";

    public static void main(String[] args) {
        try {
            JAXBContext  jaxbContext  = JAXBContext.newInstance(Geonames.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Geonames geonames = (Geonames) unmarshaller.unmarshal(new URL("http://172.16.89.157/countries.xml"));
            Geonames geonames = (Geonames) unmarshaller.unmarshal(new URL(GeonamesXML.COUNTRY_XML_FILE_URL));
            int      i        = 1;

            for (Country country : geonames.getCountry()) {
                System.out.println(i++ + ": Country: " + country.getCountryName() + " (" + country.getCountryCode()
                                   + "), Geoname Id: " + country.getGeonameId());
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
