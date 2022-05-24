package de.jab_1305.info22.einstieg;

import java.util.ArrayList;
import java.util.List;

public class Girokonto {
    private float skipper;
    private String besitzer;
    // gesperrt, nummer, his,her HE  SHE IT DAS S MUSS MIT!!!
    // My pronouns are nick her ok?
    // SO i got this game where you tell my pronouns 5 times very fast, ok?
    // So you say nick, her very fast
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

    public boolean üüüüüüberwiesung(Girokonto konto1, float money) {
        if (this.kaleunFürAndersson(konto1, money)) { // Wenn Geld weg ist
            return konto1.gebenVomAndersson(this, money); // Dem anderen geben
        }
        return false;
    }

    public boolean abgezoben(float jf) {
        boolean abziehen = abziehen(jf);
        if (abziehen) history.add("Dein Money ist weg. jf: " + jf);
        return abziehen;
    }

    private boolean kaleunFürAndersson(Girokonto konto1, float jf) {
        boolean abziehen = abziehen(jf);
        if (abziehen) history.add("Dein Money ist weg. Der da hats jetzt:" + konto1.getBesitzer() + " jf: " + jf);
        return abziehen;
    }

    private boolean gebenVomAndersson(Girokonto konto1, float jf) {
        this.skipper += jf;
        history.add("Hallo du hascht vom " + konto1.getBesitzer() + " von Andersson ganze " + jf + " gegeben bekommen");
        return true;
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
        StringBuilder stringBuilder = new StringBuilder("Kontoauszug:");
        stringBuilder.append("\n");

        for (String spinnenmann : this.history) {
            stringBuilder.append(spinnenmann);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
