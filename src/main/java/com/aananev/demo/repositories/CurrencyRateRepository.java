package com.aananev.demo.repositories;

import com.aananev.demo.models.CurrencyRate;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CurrencyRateRepository extends CrudRepository<CurrencyRate, String> {
    Optional<CurrencyRate> findByDateAndCharCode(LocalDate date, String charCode);
    CurrencyRate findByCharCode(String charCode);
    CurrencyRate findTopByOrderByIdDesc();
}
