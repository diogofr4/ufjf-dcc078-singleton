import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionBdTest {
    @Test
    void deveRetornarUrldoBancodeDados() {
        String url = "DESKTOP-EM3BE8C";
        ConnectionBd.getInstance().setUrl(url);
        assertEquals(url, ConnectionBd.getInstance().getUrl());
    }

    @Test
    void deveRetornarUsuariodoBancodeDados() {
        String user = "application";
        ConnectionBd.getInstance().setUser(user);
        assertEquals(user, ConnectionBd.getInstance().getUser());
    }

    @Test
    void deveRetornarSenhadoBancodeDados() {
        String password = "application";
        ConnectionBd.getInstance().setPassword(password);
        assertEquals(password, ConnectionBd.getInstance().getPassword());
    }
}