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
    public static void main(String[] args) {
        // ObjectMapper instantiation
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<CountriesRDO> myObjects = objectMapper.readValue(Paths.get("src\\resource\\languageByCountry.json").toFile(), new TypeReference<List<CountriesRDO>>(){});
            System.out.println(myObjects.get(0).country);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Print information
        

    }
}
