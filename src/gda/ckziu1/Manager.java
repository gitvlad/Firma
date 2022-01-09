package gda.ckziu1;

public class Manager extends Pracownik{
    private double bonusPensja;

    public Manager(String imie, String nazwisko, double pensja, double bonusPensja) {
        super(imie, nazwisko, pensja);
        this.bonusPensja = bonusPensja;
    }

    public Manager() {

    }

    public double getBonusPensja() {
        return bonusPensja;
    }

    public void setBonusPensja(double bonusPensja) {
        this.bonusPensja = bonusPensja;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonusPensja=" + bonusPensja +
                '}';
    }

    @Override
    public double getPensja() {
        double pensja = super.getPensja();
        return pensja + bonusPensja;
    }

    public void setBonusPensja() {
    }
}
