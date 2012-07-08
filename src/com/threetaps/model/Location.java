package com.threetaps.model;

public class Location
{
  private java.lang.String code;
  private int countryRank;
  private java.lang.String country;
  private int cityRank;
  private java.lang.String city;
  private java.lang.String stateCode;
  private java.lang.String stateName;
  private boolean hidden;
  private float latitude;
  private float longitude;

  public Location()
  {
  }

  public String getCode()
  {
    return code;
  }

  public void setCode(String code)
  {
    this.code = code;
  }

  public int getCountryRank()
  {
    return countryRank;
  }

  public void setCountryRank(int countryRank)
  {
    this.countryRank = countryRank;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public int getCityRank()
  {
    return cityRank;
  }

  public void setCityRank(int cityRank)
  {
    this.cityRank = cityRank;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getStateCode()
  {
    return stateCode;
  }

  public void setStateCode(String stateCode)
  {
    this.stateCode = stateCode;
  }

  public String getStateName()
  {
    return stateName;
  }

  public void setStateName(String stateName)
  {
    this.stateName = stateName;
  }

  public boolean isHidden()
  {
    return hidden;
  }

  public void setHidden(boolean hidden)
  {
    this.hidden = hidden;
  }

  public float getLatitude()
  {
    return latitude;
  }

  public void setLatitude(float latitude)
  {
    this.latitude = latitude;
  }

  public float getLongitude()
  {
    return longitude;
  }

  public void setLongitude(float longitude)
  {
    this.longitude = longitude;
  }
}