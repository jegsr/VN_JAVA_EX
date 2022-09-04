package vn.java.exercise;

import java.util.Arrays;
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

    public int getNumberOfCountries() {
        int numberCountries = 0;

        for (CountriesRDO country : this.countriesList) {
            if (country.getCountry() != null) {
                numberCountries++;
            }
        }
        return numberCountries;
    }

    public String getCountryWithMostOfficialLang() {
        int numberLang = 0;
        String languageToFind = "de";
        String countryMaxLang = null;

        for (CountriesRDO country : this.countriesList) {
            if (Arrays.asList(country.getLanguages().toArray()).contains(languageToFind)) {
                int arraySize = country.getLanguages().size();

                if (numberLang < arraySize) {
                    numberLang = arraySize;
                    countryMaxLang = country.getCountry();
                }
            }
        }

        return countryMaxLang;
    }
}
