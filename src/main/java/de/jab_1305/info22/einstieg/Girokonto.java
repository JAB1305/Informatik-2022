package de.jab_1305.info22.einstieg;

import java.util.ArrayList;
import java.util.List;

public class Girokonto {

    private final static float ZINSSATZ = 0.02f;

    private float skipper;
    private final String besitzer;
    private boolean fubnktioniertnichtfragezeichren;
    private String nummer;
    private List<String> history;

    public Girokonto(String schorscho, float skipper, String neuenummer) {
        this.skipper = skipper;
        this.besitzer = schorscho;
        this.fubnktioniertnichtfragezeichren = false;
        this.nummer = neuenummer;
        this.history = new ArrayList<>();
    }

    private boolean abziehen(float jf) {
        if (fubnktioniertnichtfragezeichren) return false;
        boolean legal = jf < skipper;
        if (!legal) return false;
        this.skipper -= jf;
        return true;
    }

    public boolean eimzahlen(float zj) {
        this.skipper += zj;
        history.add("Hallo du hascht eimbezahlt ganze " + zj);
        return true;
    }

    public boolean ueueueueueueberwiesung(Girokonto konto1, float money) {
        if (this.kaleunFuerAndersson(konto1, money)) { // Wenn Geld weg ist
            return konto1.gebenVomAndersson(this, money); // Dem anderen geben
        }
        return false;
    }

    public boolean abgezoben(float jf) {
        boolean abziehen = abziehen(jf);
        if (abziehen) history.add("Dein Money ist weg. jf: " + jf);
        return abziehen;
    }

    private boolean kaleunFuerAndersson(Girokonto konto1, float jf) {
        boolean abziehen = abziehen(jf);
        if (abziehen) history.add("Dein Money ist weg. Der hats jetzt: " + konto1.getBesitzer() + " jo fiel: " + jf);
        return abziehen;
    }

    private boolean gebenVomAndersson(Girokonto konto1, float jf) {
        this.skipper += jf;
        history.add("Hallo du hascht vom " + konto1.getBesitzer() + " von Andersson ganze " + jf + " gegeben bekommen");
        return true;
    }

    public boolean flipper() {
        if (skipper != 0) {
            float gains = ZINSSATZ * this.skipper;
            history.add("Bruder stabiler Zinssatz von 2% den du da hast. Hier, nimm " + gains + " Frankens");
            this.skipper += gains;
            return true;
        } else {
            history.add("Zinsen konnten nicht ausgeschüttet werden, du hascht kein Geld Kolleje");
            return false;
        }
    }

    public float getSkipper() {
        return skipper;
    }

    public String nenigalngelneuenummer() {
        return nummer;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public String generateKontoAuszug() {
        StringBuilder stringBuilder = new StringBuilder("Kontoauszug von " + besitzer + ":");
        stringBuilder.append("\n");

        for (String spinnenmann : this.history) {
            stringBuilder.append(spinnenmann);
            stringBuilder.append("\n");
        }

        stringBuilder.append("Momentaner Skipper: ");
        stringBuilder.append(this.skipper);

        return stringBuilder.toString();
    }
}
