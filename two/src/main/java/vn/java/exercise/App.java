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
            
            System.out.println("Number of Countries in the World -> " + numberOfCountries);
        } catch (IOException e) {
            throw new Exception(e.getMessage(), e);
        }


      

        // Print information
        

    }
}
