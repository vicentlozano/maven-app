import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test  // <-- Corregit, ara és una anotació vàlida
    public void testApp() {
        Application myApp = new Application();
        String result = myApp.getStatus();
        assertEquals("OK", result);
    }
}