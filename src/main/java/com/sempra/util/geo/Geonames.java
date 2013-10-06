package com.sempra.util.geo;

//~--- JDK imports ------------------------------------------------------------

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "geonames")
public class Geonames {
    private List<Country> country;

    public List<Country> getCountry() {
        return country;
    }

    @XmlElement(name = "country")
    public void setCountry(List<Country> country) {
        this.country = country;
    }
}
