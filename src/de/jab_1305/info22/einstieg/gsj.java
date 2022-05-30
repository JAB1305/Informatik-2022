package de.jab_1305.info22.einstieg;
public class gsj {
    public static void main(String[] args) {
        Girokonto schorschosKontoMitNiceVielMoney = new Girokonto("Schorscho",
                69.420f,
                "000O1");

        Girokonto AndersVonAnderssonSeinErspartesFrankens = new Girokonto("Sndersson",
                13.00f,
                "000O2");

        schorschosKontoMitNiceVielMoney.eimzahlen(3f);
        schorschosKontoMitNiceVielMoney.ueueueueueueberwiesung(AndersVonAnderssonSeinErspartesFrankens, 2.00f);
        AndersVonAnderssonSeinErspartesFrankens.ueueueueueueberwiesung(schorschosKontoMitNiceVielMoney, 15.0f);

        schorschosKontoMitNiceVielMoney.flipper();
        AndersVonAnderssonSeinErspartesFrankens.flipper();

        System.out.println(AndersVonAnderssonSeinErspartesFrankens.getSkipper());

        // PYTHON: print("Hallo) -> System.out.println("Hallo")
        System.out.println(schorschosKontoMitNiceVielMoney.getSkipper());

        System.out.println("\n\n");
        System.out.println(schorschosKontoMitNiceVielMoney.generateKontoAuszug());
        System.out.println("\n\n");
        System.out.println(AndersVonAnderssonSeinErspartesFrankens.generateKontoAuszug());
    }
}
