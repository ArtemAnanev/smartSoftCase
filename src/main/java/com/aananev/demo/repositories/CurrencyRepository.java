package com.aananev.demo.repositories;

import com.aananev.demo.models.Currency;
import org.springframework.data.repository.CrudRepository;


public interface CurrencyRepository extends CrudRepository<Currency, String> {
    Currency findByCharCode(String charCode);
}
