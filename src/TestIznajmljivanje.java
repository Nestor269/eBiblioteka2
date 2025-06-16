import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TestIznajmljivanje {

    IznajmljivanjeDAO dao = new IznajmljivanjeDAO();

    @Test
    public void testIznajmljivanje() {
        boolean rezultat = dao.iznajmiKnjigu(1, 1, LocalDate.now(), LocalDate.now().plusDays(7));
        assertTrue(rezultat);
    }
}
