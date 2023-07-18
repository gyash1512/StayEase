import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddCredentials {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/login";
        String user = "root";
        String password = "root";

        String[][] data1 = {{"e22cseu1117","amazing"}, {"e22cseu1127", "beingstar"}, {"e22cseu1138","sleepy"}};
        String[][] data2 = {{"sumitbadotra","btech"}};
        String[][] data3 = {{"yash","themainadmin"},{"kaushal","admin"}};

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String query1 = "INSERT INTO credentialsstu(username, password) VALUES (?, ?)";
            PreparedStatement pst1 = con.prepareStatement(query1);

            for (String[] row : data1) {
                pst1.setString(1, row[0]);
                pst1.setString(2, row[1]);
                pst1.executeUpdate();
            }

            String query2 = "INSERT INTO credentialsfac(username, password) VALUES (?, ?)";
            PreparedStatement pst2 = con.prepareStatement(query2);

            for (String[] row : data2) {
                pst2.setString(1, row[0]);
                pst2.setString(2, row[1]);
                pst2.executeUpdate();
            }

            String query3 = "INSERT INTO credentialsadm(username, password) VALUES (?, ?)";
            PreparedStatement pst3 = con.prepareStatement(query3);

            for (String[] row : data3) {
                pst3.setString(1, row[0]);
                pst3.setString(2, row[1]);
                pst3.executeUpdate();
            }

            System.out.println("Data added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}