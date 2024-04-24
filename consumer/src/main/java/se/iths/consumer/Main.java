package se.iths.consumer;

import se.iths.service.CurrencyConverter;
import se.iths.provider.EuroToDollarConverter;
import se.iths.provider.SekToDollarConverter;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

        public static void main(String[] args) {

            ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("Välj en konvertering:");
                System.out.println("1. Euro till Dollar");
                System.out.println("2. SEK till Dollar");
                System.out.println("3. Avsluta");

                try {
                    int choice = Integer.parseInt(scan.nextLine());

                    if (choice == 3) {
                        System.out.println("Programmet avslutas.");
                        break;
                    }

                    CurrencyConverter converter = null;

                    for (CurrencyConverter c : loader) {
                        if ((choice == 1 && c instanceof EuroToDollarConverter) || (choice == 2 && c instanceof SekToDollarConverter)) {
                            converter = c;
                            break;
                        }
                    }

                    if (converter == null) {
                        System.out.println("Ogiltigt val. Försök igen.");
                        continue;
                    }

                    System.out.println("Ange belopp att konvertera:");
                    double amount = Double.parseDouble(scan.nextLine());


                    double result = converter.convert(amount);

                    System.out.println("Resultat: " + result);

                } catch (NumberFormatException e) {
                    System.out.println("Ogiltig inmatning. Var god mata in en siffra.");
                    scan.nextLine();
                }
            }

            scan.close();
        }
    }
