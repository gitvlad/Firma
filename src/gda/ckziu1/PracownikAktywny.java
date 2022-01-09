package gda.ckziu1;

public class PracownikAktywny extends Pracownik implements Aktywni{

    private boolean jestAktywny;

    private boolean jestSzybki;

    private boolean jestWydajny;

    public PracownikAktywny(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko, pensja);
    }

    public PracownikAktywny () {

    }

    public boolean isJestAktywny() {
        return jestAktywny;
    }

    public void setJestAktywny(boolean jestAktywny) {
        this.jestAktywny = jestAktywny;
    }

    @Override
    public void jestemAktywny() {
        jestWydajny = true;
    }

    @Override
    public void szybciejPracuje() {
        jestSzybki = true;
    }

    public boolean isJestSzybki() {
        return jestSzybki;
    }

    public void setJestSzybki(boolean jestSzybki) {
        this.jestSzybki = jestSzybki;
    }

    public boolean isJestWydajny() {
        return jestWydajny;
    }

    public void setJestWydajny(boolean jestWydajny) {
        this.jestWydajny = jestWydajny;
    }
}
