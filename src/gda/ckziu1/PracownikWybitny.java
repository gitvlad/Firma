package gda.ckziu1;

public class PracownikWybitny extends Pracownik implements Wybitni{

    private boolean jestWybitny;

    public boolean isJestWybitny() {
        return jestWybitny;
    }

    public void setJestWybitny(boolean jestWybitny) {
        this.jestWybitny = jestWybitny;
    }

    @Override
    public void jestemWybitny() {

    }
}
