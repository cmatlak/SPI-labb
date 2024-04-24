package se.iths.provider;

import se.iths.service.CurrencyConverter;

public class EuroToDollarConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 1.22;
    }
}
