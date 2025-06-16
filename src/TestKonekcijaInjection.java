public class TestKonekcijaInjection {
    public static void main(String[] args) {
        DBConnection db = new DBConnection();

        String email = "' OR '1'='1";
        String lozinka = "nebitno";
        boolean pokusaj = false;

        try {
            if (db.proveriLogin(email, lozinka)) {
                System.out.println("❌ SQL injection uspeo! Ovo ne bi smelo da se dogodi.");
                pokusaj = true;
            } else {
                System.out.println("✅ SQL injection pokušaj odbijen – zaštita funkcioniše.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!pokusaj) {
            System.out.println("Test prošao: sistem je bezbedan od jednostavnog injection napada.");
        }
    }
}
