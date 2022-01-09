package gda.ckziu1;

public class SzefWszystkichSzefow extends Manager{

    private double extraBonusPensja;

    public SzefWszystkichSzefow(String imie, String nazwisko, double pensja, double bonusPensja, double extraBonusPensja) {
        super(imie, nazwisko, pensja, bonusPensja);
        this.extraBonusPensja = extraBonusPensja;
    }

    @Override
    public double getPensja() {
        double pensjaManager = super.getPensja();
        return  pensjaManager + extraBonusPensja;
    }

    public double getExtraBonusPensja() {
        return extraBonusPensja;
    }

    public void setExtraBonusPensja(double extraBonusPensja) {
        this.extraBonusPensja = extraBonusPensja;
    }

    @Override
    public String toString() {
        return "SzefWszystkichSzefow{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                ", bonusManager=" + getBonusPensja() +
                ", extraBonusPensja=" + extraBonusPensja +
                '}';
    }
}
