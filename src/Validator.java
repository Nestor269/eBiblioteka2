public class Validator {

    // Validacija email adrese
    public boolean validirajEmail(String email) {
        // Dozvoljava samo validne email adrese bez razmaka
        return email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
    }

    // Validacija lozinke
    public boolean validirajLozinku(String lozinka) {
        // Lozinka mora da ima minimum 6 karaktera, sadrži slova i brojeve, bez specijalnih znakova
        return lozinka.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$");
    }
    public boolean validirajKorisnickoIme(String korisnickoIme) {
        return korisnickoIme != null && korisnickoIme.matches("[a-zA-Z0-9_]{5,15}");
    }

}
