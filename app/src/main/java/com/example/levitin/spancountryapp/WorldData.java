package com.example.levitin.spancountryapp;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class WorldData {
 private ArrayList<Country> countries = new ArrayList<>();

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public ArrayList<String> getNameCountries(){
        ArrayList<String> resArr = new ArrayList<>();
        for (Country country :getCountries()) {
            resArr.add(country.getCountryName());
        }
        return  resArr;
    }

public Country findCountry(String name){
        for(Country country: countries){
            if(country.getCountryName().equals(name))
                return country;
            }
     return null;
}
    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }
}

class Country{
  private ArrayList<Region> regions;
  private String countryName;

    public Country(String countryName, ArrayList<Region> regions) {
        setRegions(regions);
        setCountryName(countryName);
    }

    public ArrayList<Region> getRegions() {
         return regions;
     }

     public void setRegions(ArrayList<Region> regions) {
         this.regions = regions;
     }

     public String getCountryName() {
         return countryName;
     }

     public Region findRregion(String name){
        for(Region r : regions){
            if(r.getRegionName().equals(name))
                return r;
          }
           return null;
     }

     public void setCountryName(String countryName) {
         this.countryName = countryName;
     }

     public ArrayList<String> getRegionName() {
        ArrayList<String> resArr = new ArrayList<>();
        for (Region region :getRegions()) {
            resArr.add(region.getRegionName());
        }
        return  resArr;

    }
 }
class Region{
    private ArrayList<City> cities;
    private String regionName;

    Region(String regName,ArrayList<City> cities){
        this.regionName =regName;
        this.cities = cities;

    }

     public ArrayList<City> getCities() {
         return cities;
     }

     public void setCities(ArrayList<City> cities) {
         this.cities = cities;
     }

     public String getRegionName() {
         return regionName;
     }

     public void setRegionName(String regionName) {
         this.regionName = regionName;
     }

    public ArrayList<String> getCityName() {
        ArrayList<String> resArr = new ArrayList<>();
        for (City city :getCities()) {
            resArr.add(city.getCityName());
        }
        return  resArr;

    }
 }

class City{
    private String cityName;
    City(String cityName){
        this.cityName = cityName;
    }
     public String getCityName() {
         return cityName;
     }

     public void setCityName(String cityName) {
         this.cityName = cityName;
     }
 }