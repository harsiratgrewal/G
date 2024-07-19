import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection dbLink;

    public Connection DBconnection() throws IOException {
        // Reading from the file dbInfo.txt and storing it in an array.
        // Line 1 = URL, Line 2 = DB Name, Line 3 = DB Username, Line 4 = DB Password
        try{
        List<String> dbList = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new FileReader("dbInfo.txt"));
        String line = bf.readLine();
        while (line != null) {
            dbList.add(line);
            line = bf.readLine();
        }
        bf.close();
        dbList.toArray(new String[0]);

        // Storing the elements from array to variables.
        String url = dbList.get(0), dbName = dbList.get(1), dbUsername = dbList.get(2), dbPassword =
        dbList.get(3);

        // Call the database
        String connectionUrl = url + ";"
                + "database=" + dbName + ";"
                + "user=" + dbUsername + ";"
                + "password=" + dbPassword + ";"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "loginTimeout=30;";
        
            dbLink = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbLink;
    }
}
