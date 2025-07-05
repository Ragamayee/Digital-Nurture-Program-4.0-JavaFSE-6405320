package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;

import java.util.List;


@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        LOGGER.info("Inside main");
        testAddCountry(); 
        }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
    
    private static void testFindCountryByCode() {
        LOGGER.info("Start");

        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }

        LOGGER.info("End");
    }
    
    private static void testAddCountry() {
        LOGGER.info("Start");

        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");

        countryService.addCountry(country);

        try {
            Country retrievedCountry = countryService.findCountryByCode("JP");
            LOGGER.debug("Added Country: {}", retrievedCountry);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }

        LOGGER.info("End");
    }


}
