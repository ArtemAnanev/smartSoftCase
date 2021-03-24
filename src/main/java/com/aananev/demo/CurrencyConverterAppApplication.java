package com.aananev.demo;

import com.aananev.demo.models.Currency;
import com.aananev.demo.models.CurrencyRate;
import com.aananev.demo.repositories.CurrencyRateRepository;
import com.aananev.demo.repositories.CurrencyRepository;
import com.aananev.demo.services.XMLService;
import com.aananev.demo.views.DataFromXML;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyConverterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterAppApplication.class, args);


	}
	@Bean
	ApplicationRunner init(CurrencyRepository repository, CurrencyRateRepository rateRepository) {
		DataFromXML data = XMLService.parseRates();
		return args -> {
			repository.save(new Currency("1", "111", "RUB", 1, "Российский рубль"));
			for(Currency c:data.getCurrencies())
				repository.save(c);
			rateRepository.save(new CurrencyRate("1", null, "RUB", 1.0));
			for(CurrencyRate cr:data.getCurrencyRates())
				rateRepository.save(cr);
		};
	}
}
