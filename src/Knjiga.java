public class Knjiga {
    private int id;
    private String naslov;
    private String autor;
    private int godinaIzdavanja;
    private boolean dostupna;

    public Knjiga(String naslov, String autor, int godinaIzdavanja, boolean dostupna) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = godinaIzdavanja;
        this.dostupna = dostupna;
    }

    public Knjiga(int id, String naslov, String autor, int godinaIzdavanja, boolean dostupna) {
        this.id = id;
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdavanja = godinaIzdavanja;
        this.dostupna = dostupna;
    }

    // Getteri
    public int getId() { return id; }
    public String getNaslov() { return naslov; }
    public String getAutor() { return autor; }
    public int getGodinaIzdavanja() { return godinaIzdavanja; }
    public boolean isDostupna() { return dostupna; }

    // Setteri
    public void setId(int id) { this.id = id; }
    public void setNaslov(String naslov) { this.naslov = naslov; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setGodinaIzdavanja(int godina) { this.godinaIzdavanja = godina; }
    public void setDostupna(boolean dostupna) { this.dostupna = dostupna; }
}
