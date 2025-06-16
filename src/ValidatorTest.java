import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ValidatorTest {

    Validator validator = new Validator();

    @Test
    public void testValidanEmail() {
        assertTrue(validator.validirajEmail("test@gmail.com"), "Validan email nije prepoznat kao validan.");
    }

    @Test
    public void testNevalidanEmail() {
        assertFalse(validator.validirajEmail("gmail.com"), "Nevalidan email je pogrešno prepoznat kao validan.");
    }

    @Test
    public void testIspravnaLozinka() {
        assertTrue(validator.validirajLozinku("Test123"), "Ispravna lozinka nije prepoznata kao ispravna.");
    }

    @Test
    public void testSlabaLozinka() {
        assertFalse(validator.validirajLozinku("abc"), "Slaba lozinka je pogrešno prepoznata kao ispravna.");
    }

    @Test
    public void testEmailBezAtSimbola() {
        assertFalse(validator.validirajEmail("nesto.gmail.com"), "Email bez @ je pogrešno prepoznat kao validan.");
    }

    @Test
    public void testEmailSaRazmakom() {
        assertFalse(validator.validirajEmail("test @gmail.com"), "Email sa razmakom je pogrešno prepoznat kao validan.");
    }

    @Test
    public void testLozinkaBezBrojeva() {
        assertFalse(validator.validirajLozinku("TestTest"), "Lozinka bez brojeva je pogrešno prepoznata kao validna.");
    }

    @Test
    public void testLozinkaBezSlova() {
        assertFalse(validator.validirajLozinku("123456"), "Lozinka bez slova je pogrešno prepoznata kao validna.");
    }

    @Test
    public void testLozinkaSaSpecijalnimZnakom() {
        assertFalse(validator.validirajLozinku("Test@123"), "Lozinka sa specijalnim znakom je pogrešno prepoznata kao validna (ako nije dozvoljeno).");
    }

    @Test
    public void testMinimalnaDuzinaLozinke() {
        assertFalse(validator.validirajLozinku("Tes1"), "Lozinka kraća od minimalne dužine je pogrešno prihvaćena.");
    }
}
