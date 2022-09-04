package vn.java.exercise.rdo;

import java.util.ArrayList;

public class CountriesRDO {
    public String country;
    public ArrayList<String> languages;

    public CountriesRDO() {
    }

    public CountriesRDO(String country, ArrayList<String> languages) {
        this.country = country;
        this.languages = languages;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

}
