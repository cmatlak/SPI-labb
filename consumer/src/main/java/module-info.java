import se.iths.service.CurrencyConverter;

module consumer {
    requires service;
    requires provider;
    uses CurrencyConverter;
}