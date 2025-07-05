import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
            	    "jdbc:mysql://localhost:3306/ormlearn", // <-- your actual DB name
            	    "root",                                  // <-- your MySQL username
            	    "1234"                                   // <-- your MySQL password
            	);

            System.out.println("✅ DB Connected Successfully!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
