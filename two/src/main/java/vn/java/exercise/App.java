package vn.java.exercise;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import vn.java.exercise.rdo.CountriesRDO;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        //Path to the JSON File
        String jsonFile = "src\\resource\\languageByCountry.json";
        // ObjectMapper instantiation
        ObjectMapper objectMapper = new ObjectMapper();
       
        try {
             //Json to Object
            List<CountriesRDO> countriesList = objectMapper.readValue(Paths.get(jsonFile).toFile(), new TypeReference<List<CountriesRDO>>(){});

            CountryListManipulation listManipulation = new CountryListManipulation(countriesList);
            int numberOfCountries = listManipulation.getNumberOfCountries();
            String countryMostLangGerman = listManipulation.getCountryWithMostOfficialLangGerman();
            int numberOfOfficialLang = listManipulation.getNumberOfLanguages();
            String countryMostOffLang = listManipulation.getCountryWithHighestOffLang();

            System.out.println("Number of Countries in the World -> " + numberOfCountries);
            System.out.println("Country with most official Languages where they speak German -> " + countryMostLangGerman);
            System.out.println("Number of Official Languages -> " + numberOfOfficialLang);
            System.out.println("Country with highest official Languages -> " + countryMostOffLang);

        } catch (IOException e) {
            throw new Exception(e.getMessage(), e);
        }


      

        // Print information
        

    }
}
