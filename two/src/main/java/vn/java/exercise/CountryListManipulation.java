package vn.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import vn.java.exercise.rdo.CountriesRDO;

/*
 * Class responsible for the manipulation of the JSON
 */
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

    /*
     * Method that will retrieved the number of Countries present on JSON file.
     * 
     * Return @int
     */
    public int getNumberOfCountries() {
        int numberCountries = 0;

        for (CountriesRDO country : this.countriesList) {
            if (country.getCountry() != null) {
                numberCountries++;
            }
        }
        return numberCountries;
    }

    /*
     * Method that will retrieve the Country with the most official Languages
     * including German.
     * 
     * Return @String.
     */
    public String getCountryWithMostOfficialLangGerman() {
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

    /*
     * Method that will retrieve number of languages.
     * 
     * Return @int.
     */
    public int getNumberOfLanguages() {
        List<String> officialList = new ArrayList<>();
        Set<String> officialListNoDup = null;

        for (CountriesRDO country : this.countriesList) {
            officialList.addAll(country.getLanguages());
        }

        officialListNoDup = new HashSet<String>(officialList);

        return officialListNoDup.size();
    }

    /*
     * Method that will retrieve the Country with the most Official Languages.
     * 
     * Return @String.
     */
    public String getCountryWithHighestOffLang() {
        int numberLang = 0;
        String countryMaxLang = null;

        for (CountriesRDO country : this.countriesList) {
            int arraySize = country.getLanguages().size();

            if (numberLang < arraySize) {
                numberLang = arraySize;
                countryMaxLang = country.getCountry();
            }
        }

        return countryMaxLang;
    }

    /*
     * Method that will retrieve a list containing the Most Common Languages.
     * 
     * Return @List<String>.
     */
    public List<String> getMostCommonLang() {
        Map<String, Integer> langMap = new HashMap<String, Integer>();
        int highestValue = 0;
        List<String> langList = new ArrayList<>();

        for (CountriesRDO country : this.countriesList) {
            for (String lang : country.getLanguages()) {
                if (langMap.get(lang) == null) {
                    langMap.put(lang, 1);
                } else {
                    langMap.put(lang, langMap.get(lang) + 1);
                }

            }
        }

        for (Map.Entry<String, Integer> entry : langMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (highestValue < value || highestValue == value) {
                langList.add(key);
                highestValue = value;
            }
        }

        return langList;
    }
}
