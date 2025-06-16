public class Statistika {

    private int brojKnjiga;
    private int brojIznajmljivanja;

    public Statistika(int brojKnjiga, int brojIznajmljivanja) {
        this.brojKnjiga = brojKnjiga;
        this.brojIznajmljivanja = brojIznajmljivanja;
    }

    public void prikaziStatistiku() {
        System.out.println("📊 Statistika sistema:");
        System.out.println("Ukupan broj knjiga: " + brojKnjiga);
        System.out.println("Ukupan broj iznajmljivanja: " + brojIznajmljivanja);
    }
}
