import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KnjigaDAO {

    public void dodajKnjigu(Knjiga knjiga) {
        String sql = "INSERT INTO knjiga (naslov, autor, godina_izdavanja, dostupna) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, knjiga.getNaslov());
            stmt.setString(2, knjiga.getAutor());
            stmt.setInt(3, knjiga.getGodinaIzdavanja());
            stmt.setBoolean(4, knjiga.isDostupna());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Knjiga> vratiSve() {
        List<Knjiga> knjige = new ArrayList<>();
        String sql = "SELECT * FROM knjiga";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Knjiga k = new Knjiga(
                        rs.getInt("id"),
                        rs.getString("naslov"),
                        rs.getString("autor"),
                        rs.getInt("godina_izdavanja"),
                        rs.getBoolean("dostupna")
                );
                knjige.add(k);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return knjige;
    }

    public void prikaziSveKnjige() {
        List<Knjiga> knjige = vratiSve();
        for (Knjiga k : knjige) {
            System.out.println("Naslov: " + k.getNaslov()
                    + ", Autor: " + k.getAutor()
                    + ", Godina: " + k.getGodinaIzdavanja()
                    + ", Dostupna: " + (k.isDostupna() ? "da" : "ne"));
        }
    }
}
