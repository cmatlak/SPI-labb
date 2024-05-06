
import se.iths.service.CurrencyConverter;

module se.iths.consumer{

    requires service;
    requires provider;

    uses CurrencyConverter;
}