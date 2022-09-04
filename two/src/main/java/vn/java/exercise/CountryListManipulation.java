package vn.java.exercise;

import java.util.List;

import vn.java.exercise.rdo.CountriesRDO;

public class CountryListManipulation {
    private List<CountriesRDO> countriesList;

    public CountryListManipulation(List<CountriesRDO> countriesList) {
        this.countriesList = countriesList;
    }

    public List<CountriesRDO> getCountriesList() {
        return countriesList;
    }

    public void setCountriesList(List<CountriesRDO> countriesList) {
        this.countriesList = countriesList;
    }

    public int getNumberOfCountries(){
        int numberCountries = 0;

        for(CountriesRDO country : this.countriesList){
            if(country.getCountry() != null){
                numberCountries++;
            }  
        }
        return numberCountries;
    }
}
