import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ebibliotekabaza2";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static boolean proveriLogin(String email, String lozinka) {
        try (Connection conn = getConnection()) {
            String sql = "SELECT * FROM korisnik WHERE email = ? AND lozinka = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, lozinka);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
