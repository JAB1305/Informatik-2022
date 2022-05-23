package de.jab_1305.info22.einstieg;

public class Girokonto {
    private float skipper;
    private String besitzer;
    // gesperrt, nummer, his,her HE  SHE IT DAS S MUSS MIT!!!
    // My pronouns are nick her ok?
    // SO i got this game where you tell my pronouns 5 times very fast, ok?
    // So you say nick, her very fast
    private boolean fubnktioniertnichtfragezeichren;
    private  String nummer;

    public Girokonto(String schorscho, float skipper, String neuenummer) {
        this.skipper = skipper;
        this.besitzer = schorscho;
        this.fubnktioniertnichtfragezeichren = false;
        this.nummer = neuenummer;
    }

    public boolean eimzahlen(float zj) {
        this.skipper += zj;
        return true;
    }

    public boolean geklapptfrageezeichen(float jf) {
        if (fubnktioniertnichtfragezeichren) return false;
        if (jf > skipper) return false;

        this.skipper -= jf;
        return true;
    }

    public float getSkipper() {
        return skipper;
    }

    public String nenigalngelneuenummer() {
        return nummer;
    }
}
