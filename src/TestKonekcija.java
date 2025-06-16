import java.sql.Connection;

public class TestKonekcija {
    public static void main(String[] args) {
        try {
            DBConnection db = new DBConnection();               // ➤ napravi instancu
            Connection konekcija = db.getConnection();          // ➤ koristi metodu

            System.out.println("✅ Uspešno povezano sa bazom!");
            konekcija.close();
        } catch (Exception e) {
            System.out.println("❌ Greška prilikom povezivanja: " + e.getMessage());
        }
    }
}
