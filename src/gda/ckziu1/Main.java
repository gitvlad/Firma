package gda.ckziu1;

public class Main {

    public static void main(String[] args) {

       // Pracownik pracownik = new Pracownik();
        Pracownik pracownik = new Pracownik("Tomek", "Kowalski", 5000);

        /*PracownikAktywny pracownikAktywny = (PracownikAktywny) new Pracownik();
        pracownikAktywny.setJestAktywny(true);
        //pracownikAktywny.szybciejPracuje();
        pracownikAktywny.szybciejPracuje();
        System.out.println(pracownikAktywny);*/

        //PracownikAktywny pracownikAktywny2 = new PracownikAktywny();
        PracownikAktywny pracownikAktywny2 = new PracownikAktywny("Zosia","Samosia", 9000);
        pracownikAktywny2.setJestAktywny(true);
        pracownikAktywny2.szybciejPracuje();
        System.out.println("@" + pracownikAktywny2);
        System.out.println("@@" + pracownikAktywny2.isJestAktywny());
        System.out.println("@@@" + pracownikAktywny2.isJestSzybki());

        if (pracownikAktywny2.isJestAktywny()){
            System.out.println("Bardzo się cieszymy, że Zosia zostanie pracownikiem miesiąca");
        }



        //Manager boss = (Manager) new Pracownik();
       // boss.getBonusPensja();

       // Manager boss2 = new Manager();
       // boss2.setBonusPensja();



        //System.out.println(pracownik);
        Pracownik pracownik2 = new Pracownik("Janek", "Nowak", 5100);

        Pracownik pracownik3 = new Pracownik("Anna", "Mackiewicz", 5000 );

        Manager manager = new Manager("JanekManager", "Nowak", 30000, 2000);
        System.out.println(manager);
        manager.setBonusPensja(3000.50);

        System.out.println("Jak jest teraz pensja menedzera JanekManager:  " + manager.getPensja());
        System.out.println("Jak jest teraz pensja pracownika Janek:  " + pracownik.getPensja());

        SzefWszystkichSzefow szef = new SzefWszystkichSzefow("Jarzyna", "zeSzczecina", 50000, 3000, 1000);
        System.out.println("# " + szef);

        System.out.println("## " + szef.getPensja());

        //Manager manager = new Manager("JanekManager", "Nowak", 30000, 2000);

        //Manager manager2 = new Manager("AnnaManager", "Nowak", 30000, 2000);



        //pracownik.setImie("Janek");
        //System.out.println(pracownik2);
        pracownik.setImie("Tomek2");
        //pracownik2.setImie("Janek2");
        System.out.println(pracownik);
        System.out.println(pracownik2);
        System.out.println(pracownik2.getImie());

    }
}
