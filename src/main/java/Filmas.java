/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kotryna
 */
public class Filmas {
    
    private String pavadinimas;
    private Zanras zanras;
    private int metai;
    private String rezisierius;
    private String aktoriai;
    private double imdb;

    public Filmas(String pavadinimas, Zanras zanras, int metai, String rezisierius, String aktoriai, double imdb) {
        this.pavadinimas = pavadinimas;
        this.zanras = zanras;
        this.metai = metai;
        this.rezisierius = rezisierius;
        this.aktoriai = aktoriai;
        this.imdb = imdb;
    }
    
    

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Zanras getZanras() {
        return zanras;
    }

    public void setZanras(Zanras zanras) {
        this.zanras = zanras;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public String getRezisierius() {
        return rezisierius;
    }

    public void setRezisierius(String rezisierius) {
        this.rezisierius = rezisierius;
    }

    public String getAktoriai() {
        return aktoriai;
    }

    public void setAktoriai(String aktoriai) {
        this.aktoriai = aktoriai;
    }

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }
    
    
    
    
}
