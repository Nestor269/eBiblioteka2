import java.time.LocalDate;

public class Iznajmljivanje {
    private int korisnikId;
    private int knjigaId;
    private LocalDate datumOd;
    private LocalDate datumDo;

    public Iznajmljivanje(int korisnikId, int knjigaId, LocalDate datumOd, LocalDate datumDo) {
        this.korisnikId = korisnikId;
        this.knjigaId = knjigaId;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
    }

    public int getKorisnikId() { return korisnikId; }
    public int getKnjigaId() { return knjigaId; }
    public LocalDate getDatumOd() { return datumOd; }
    public LocalDate getDatumDo() { return datumDo; }
}
