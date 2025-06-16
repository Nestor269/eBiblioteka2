public class ObavestenjeService {

    public void posaljiEmail(String primalac, String naslov, String sadrzaj) {
        System.out.println("📧 Slanje email-a...");
        System.out.println("Primalac: " + primalac);
        System.out.println("Naslov: " + naslov);
        System.out.println("Sadržaj: " + sadrzaj);
        System.out.println("✅ Email uspešno poslat (simulacija)");
    }
}
