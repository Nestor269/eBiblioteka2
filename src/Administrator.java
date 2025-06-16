public class Administrator extends Korisnik {
    private String privilegije;

    public Administrator(int id, String ime, String prezime, String email, String lozinka, String privilegije) {
        super(id, ime, prezime, email, lozinka);
        this.privilegije = privilegije;
    }

    public void dodajKnjigu(Knjiga knjiga) {
        System.out.println("Knjiga \"" + knjiga.getNaslov() + "\" je dodata.");
    }

    public void obrisiKnjigu(Knjiga knjiga) {
        System.out.println("Knjiga \"" + knjiga.getNaslov() + "\" je obrisana.");
    }

    public void pregledajIzvestaj() {
        System.out.println("Prikaz izveštaja o iznajmljenim knjigama.");
    }

    public String getPrivilegije() {
        return privilegije;
    }
}
