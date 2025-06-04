
package modell;


public class Auto{
    private String rendszam;
    private String datum;
    private String fizetesmod;
    private double tav;
    private int osszeg;
    private int borravalo;
    private boolean dohanyzo;

    public Auto(String rendszam, String datum, String fizetesmod, double tav, int osszeg, int borravalo, boolean dohanyzo) {
        this.rendszam = rendszam;
        this.datum = datum;
        this.fizetesmod = fizetesmod;
        this.tav = tav;
        this.osszeg = osszeg;
        this.borravalo = borravalo;
        this.dohanyzo = dohanyzo;
    }
    
    
    public Auto(String sor){
        String[] adatok = sor.split(";");
        this.rendszam =  adatok[0];
        this.datum = adatok[1];
        this.fizetesmod = adatok[2];
        this.tav = Double.parseDouble(adatok[3]);
        this.osszeg = Integer.parseInt(adatok[4]);
        this.borravalo = Integer.parseInt(adatok[5]);
        this.dohanyzo = adatok[6].equals("igen");
    }
    
    public String getRendszam() {
        return rendszam;
    }

    public String getDatum() {
        return datum;
    }

    public String getFizetesmod() {
        return fizetesmod;
    }

    public double getTav() {
        return tav;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public int getBorravalo() {
        return borravalo;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", datum=" + datum + ", fizetesmod=" + fizetesmod + ", tav=" + tav + ", osszeg=" + osszeg + ", borravalo=" + borravalo + ", dohanyzo=" + dohanyzo + '}';
    }
    
}






