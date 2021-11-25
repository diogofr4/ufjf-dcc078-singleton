import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {
    private static Connection con;
    private String url;
    private String user;
    private String password;

    private ConnectionBd(){}
    private static ConnectionBd connectionBd = new ConnectionBd();
    public static ConnectionBd getInstance(){
        return connectionBd;
    }

    public static Connection getCon() {
        return con;
    }

    public void setCon() {
        try {
            con = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

