import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class IznajmljivanjeDAO {

    public boolean iznajmiKnjigu(int korisnikId, int knjigaId, LocalDate datumIznajmljivanja, LocalDate datumVracanja) {
        String sql = "INSERT INTO iznajmljivanje (korisnik_id, knjiga_id, datum_iznajmljivanja, datum_vracanja) VALUES (?, ?, ?, ?)";

        try (Connection conn = new DBConnection().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, korisnikId);
            stmt.setInt(2, knjigaId);
            stmt.setDate(3, java.sql.Date.valueOf(datumIznajmljivanja));
            stmt.setDate(4, java.sql.Date.valueOf(datumVracanja));

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
