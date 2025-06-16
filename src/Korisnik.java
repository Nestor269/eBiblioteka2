public class Korisnik {
    private int id;
    private String ime;
    private String prezime;
    private String email;
    private String lozinka;

    public Korisnik(int id, String ime, String prezime, String email, String lozinka) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.lozinka = lozinka;
    }

    public String getEmail() {
        return email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}
