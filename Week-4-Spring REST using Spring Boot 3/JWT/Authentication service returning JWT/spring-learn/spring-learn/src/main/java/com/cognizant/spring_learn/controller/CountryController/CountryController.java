package com.cognizant.spring_learn.controller.CountryController;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;


@RestController
public class CountryController {
	@RequestMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("Country");
        return country;
    }
	
	 @GetMapping("/countries")
	    public List<Country> getAllCountries() {
	        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	        List<Country> countries = (List<Country>) context.getBean("countryList");
	        return countries;
	    }
	
}