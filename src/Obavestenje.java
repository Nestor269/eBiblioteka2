public class Obavestenje {
    private String naslov;
    private String sadrzaj;

    public Obavestenje(String naslov, String sadrzaj) {
        this.naslov = naslov;
        this.sadrzaj = sadrzaj;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }
}
