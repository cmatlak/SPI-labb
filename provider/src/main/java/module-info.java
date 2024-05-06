import se.iths.provider.EuroToDollarConverter;
import se.iths.provider.SekToDollarConverter;
import se.iths.service.CurrencyConverter;

module provider {
    exports se.iths.provider;
    requires service;

    provides CurrencyConverter with EuroToDollarConverter, SekToDollarConverter;
}