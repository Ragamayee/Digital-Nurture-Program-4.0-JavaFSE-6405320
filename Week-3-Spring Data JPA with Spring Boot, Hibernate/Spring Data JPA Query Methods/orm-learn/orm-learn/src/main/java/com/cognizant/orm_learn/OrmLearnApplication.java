package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.model.Stock;
import com.cognizant.orm_learn.repository.StockRepository;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;


@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static StockRepository stockRepository;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		stockRepository = context.getBean(StockRepository.class);

		testStockQueries();
	}

	private static void testStockQueries() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		List<Stock> fbStocks = stockRepository.findByCodeAndDateBetween(
			"FB", sdf.parse("2019-09-01"), sdf.parse("2019-09-30"));
		fbStocks.forEach(stock -> LOGGER.debug("Facebook Stock: {}", stock));

		List<Stock> googleStocks = stockRepository.findByCodeAndCloseGreaterThan(
			"GOOGL", new BigDecimal("1250"));
		googleStocks.forEach(stock -> LOGGER.debug("Google Stock > 1250: {}", stock));

		List<Stock> topVolumeStocks = stockRepository.findTop3ByOrderByVolumeDesc();
		topVolumeStocks.forEach(stock -> LOGGER.debug("High Volume Stock: {}", stock));

		List<Stock> lowNetflix = stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
		lowNetflix.forEach(stock -> LOGGER.debug("Low Netflix Stock: {}", stock));
	}
}
