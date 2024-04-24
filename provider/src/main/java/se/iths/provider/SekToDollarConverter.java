package se.iths.provider;

import se.iths.service.CurrencyConverter;

public class SekToDollarConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 0.12;
    }
}
