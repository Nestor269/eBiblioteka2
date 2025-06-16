public class TestKnjiga {
    public static void main(String[] args) {
        try {
            KnjigaDAO dao = new KnjigaDAO();

            // Dodavanje nove knjige
            Knjiga knjiga = new Knjiga("Java za početnike", "Petar Petrović", 2024, true);
            dao.dodajKnjigu(knjiga);

            // Prikaz svih knjiga
            dao.prikaziSveKnjige();

        } catch (Exception e) {
            System.out.println("❌ Greška: " + e.getMessage());
        }
    }
}
