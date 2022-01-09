package gda.ckziu1;

public class SzefSzefowWszystkichSzefow extends SzefWszystkichSzefow  {


    public SzefSzefowWszystkichSzefow(String imie, String nazwisko, double pensja, double bonusPensja, double extraBonusPensja) {
        super(imie, nazwisko, pensja, bonusPensja, extraBonusPensja);
    }

   /* @Override
    public double getPensja() {
        double pensjaManager = super.getPensja();
        return  pensjaManager + extraBonusPensja;
    }*/
}
