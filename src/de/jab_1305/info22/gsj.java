package de.jab_1305.info22;

import de.jab_1305.info22.einstieg.Girokonto;

public class gsj {
    public static void main(String[] args) {
        String baumOhneLisbelnICHSLIBELSNICHT = "Hallo"; // Ari: Ich kann das nicht lesen
        Girokonto schorschosKontoMitNiceVielMoney = new Girokonto("Schorscho",
                69.420f,
                "Ich hab ne neue Nummer ne neue Nummer");

        Girokonto AndersVonAnderssonSeinErspartesFrankens = new Girokonto("Sndersson",
                13.00f,
                "Ne Niegel Nagel Neue Nummer");

        schorschosKontoMitNiceVielMoney.eimzahlen(3f);
        schorschosKontoMitNiceVielMoney.üüüüüüberwiesung(AndersVonAnderssonSeinErspartesFrankens, 2.00f);

        System.out.println(AndersVonAnderssonSeinErspartesFrankens.getSkipper());

        // PYTHON: print("Hallo) -> System.out.println("Hallo")
        System.out.println(schorschosKontoMitNiceVielMoney.getSkipper());

        System.out.println("\n\n");
        System.out.println(schorschosKontoMitNiceVielMoney.generateKontoAuszug());
    }
}
