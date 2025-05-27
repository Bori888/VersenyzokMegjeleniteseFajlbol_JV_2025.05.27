package modell;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Versenyzo {
    private String nev;
    private String email;
    private double atlag;
    private int elsoDb;

    public Versenyzo(String sor) {
        String[] adatok = sor.split(";");
        nev = adatok[0];
        email = adatok[1];
        atlag = Double.parseDouble(adatok[2]);
        elsoDb = Integer.parseInt(adatok[3]);
    }

    public Versenyzo(String nev, String email, double atlag, int elsoDb) {
        this.nev = nev;
        this.email = email;
        this.atlag = atlag;
        this.elsoDb = elsoDb;
    }

    public String getNev() {
        return nev;
    }

    public String getEmail() {
        return email;
    }

    public double getAtlag() {
        return atlag;
    }

    /**
     * A pontossagban megadott tizedesre kerekít
     * @param pontossag tizedesek száma
     * @return double, kerkeített értékkel
     */
    public double getAtlagKerekitveTizedessel(int pontossag){
        BigDecimal kerekitett = new BigDecimal(atlag);
        return kerekitett.setScale(pontossag, RoundingMode.HALF_UP).doubleValue();
        
        /* jobban olvasható forma: */
//        return new BigDecimal(atlag)
//            .setScale(pontossag, RoundingMode.HALF_UP)
//            .doubleValue();
    }
    
    /**
     * Levágja a pontossag utáni tizedeseket
     * @param pontossag tizedesek száma
     * @return double, de nem kerekített, hanem "levágott" érték
     */
    public double getAtlagLevagTizedessel(int pontossag){
        int sz = (int)Math.pow(10, pontossag);
        return (int)(atlag*sz)/(double)sz;
    }
    
    public int getElsoDb() {
        return elsoDb;
    }

    @Override
    public String toString() {
        return "Versenyzo{" + "nev=" + nev + ", email=" + email + ", atlag=" + atlag + ", elsoDb=" + elsoDb + '}';
    }
    
    
}
