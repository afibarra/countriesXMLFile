package com.sempra.util.geo;

//~--- JDK imports ------------------------------------------------------------

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "country")
public class Country {
    private String countryCode;
    private String countryName;
    private String isoNumeric;
    private String isoAlpha3;
    private String fipsCode;
    private String continent;
    private String continentName;
    private String capital;
    private float  areaInSqKm;
    private int    population;
    private String currencyCode;
    private String languages;
    private String geonameId;
    private float  west;
    private float  north;
    private float  east;
    private float  south;

    public String getCountryCode() {
        return countryCode;
    }

    @XmlElement
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    @XmlElement
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIsoNumeric() {
        return isoNumeric;
    }

    @XmlElement
    public void setIsoNumeric(String isoNumeric) {
        this.isoNumeric = isoNumeric;
    }

    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    @XmlElement
    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    public String getFipsCode() {
        return fipsCode;
    }

    @XmlElement
    public void setFipsCode(String fipsCode) {
        this.fipsCode = fipsCode;
    }

    public String getContinent() {
        return continent;
    }

    @XmlElement
    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinentName() {
        return continentName;
    }

    @XmlElement
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCapital() {
        return capital;
    }

    @XmlElement
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getAreaInSqKm() {
        return areaInSqKm;
    }

    @XmlElement
    public void setAreaInSqKm(float areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }

    public int getPopulation() {
        return population;
    }

    @XmlElement
    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getLanguages() {
        return languages;
    }

    @XmlElement
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getGeonameId() {
        return geonameId;
    }

    @XmlElement
    public void setGeonameId(String geonameId) {
        this.geonameId = geonameId;
    }

    public float getWest() {
        return west;
    }

    @XmlElement
    public void setWest(float west) {
        this.west = west;
    }

    public float getNorth() {
        return north;
    }

    @XmlElement
    public void setNorth(float north) {
        this.north = north;
    }

    public float getEast() {
        return east;
    }

    @XmlElement
    public void setEast(float east) {
        this.east = east;
    }

    public float getSouth() {
        return south;
    }

    @XmlElement
    public void setSouth(float south) {
        this.south = south;
    }
}
