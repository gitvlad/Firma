package gda.ckziu1;

import java.util.Date;

public class Pracownik {
    String imie;
    String nazwisko;
    double pensja;


    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

   /* public Pracownik(String imie, String nazwisko, double pensja, Date dataZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }*/

    public Pracownik() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }


    //Object object = new Object ();

    @Override
    public String toString () {
        return "Pracownik: " + "imie: " + imie + " nazwisko: " + nazwisko + " pensja: " + pensja;
    }


   /* public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }*/
}

