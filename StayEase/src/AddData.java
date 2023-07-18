
import java.sql.*;

public class AddData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tickets";
        String user = "root";
        String password = "root";

        Object[][] data1 = {
                {"e22cseu1117", "2011-01-20", "2011-01-20", "12:00:00", "14:00:00", "c2611", "Mosquito Repellent, Dusting,"},
                {"e22cseu1118", "2013-01-20", "2013-01-20", "12:50:00", "14:40:00", "c2611", "Mosquito Repellent, Dusting, Sweeping"},
                {"e22cseu1119", "2013-01-20", "2013-01-20", "12:50:00", "14:40:00", "c2619", "Mosquito Repellent, Dusting, Sweeping"},
                {"e22cseu1120", "2014-01-20", "2014-01-20", "13:50:00", "14:40:00", "c2620", "Mosquito Repellent, Dusting, Sweeping"},
                {"e22cseu1121", "2014-05-20", "2014-05-20", "13:55:00", "14:55:00", "c2621", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"e22cseu1122", "2014-05-20", "2014-05-20", "14:55:00", "15:55:00", "c2621", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"e22cseu1123", "2014-05-20", "2014-05-20", "14:55:00", "15:55:00", "c2622", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"e22cseu1124", "2015-05-20", "2015-05-20", "14:55:00", "15:55:00", "c2622","Mosquito Repellent, Dusting,"},
                {"e22cseu1125","2016-05-20","2016-05-20","14:00:00","15:00:00","c2622","Mosquito Repellent,Dusting,Web Cleaning,"},
                {"e22cseu1126","2016-05-20","2016-05-20","14:05:00","15:05:00","c2622","Mosquito Repellent,Dusting,Web Cleaning,"},
            {"e22cseu1127","2015-05-20","2015-05-20","14:00:00","14:40:00","c2623","Dusting,Web Cleaning,"},
            {"e22cseu1128","2015-05-20","2015-05-20","13:00:00","14:40:00","c2623","Dusting,Sweeping"},
            {"e22cseu1129","2016-05-20","2016-05-20","12:00:00","14:40:00","c2624","Dusting,Sweeping"},
            {"e22cseu1130","2016-05-20","2016-05-20","12:00:00","14:40:00","c2624","Mosquito Repellent,"},
            {"e22cseu1131", "2017-05-20", "2017-05-20", "12:00:00", "14:00:00", "c2625", "Mosquito Repellent,"},
            {"e22cseu1132", "2017-05-20", "2017-05-20", "13:00:00", "14:00:00", "c2612", "Mosquito Repellent, Dusting,"},
            {"e22cseu1133", "2017-04-20", "2017-04-20", "13:00:00", "14:00:00", "c2612", "Mosquito Repellent, Dusting,"},
            {"e22cseu1134", "2017-04-20", "2017-04-20", "13:10:00", "14:00:00", "c2613", "Mosquito Repellent, Sweeping,"},
                {"e22cseu1135", "2017-04-20", "2017-04-20", "13:10:00", "15:00:00", "c2613", "Mosquito Repellent, Sweeping"},
                {"e22cseu1136", "2018-04-20", "2018-04-20", "13:10:00", "15:00:00", "c2614", "Web Cleaning, "},
                {"e22cseu1137", "2018-04-20", "2018-04-20", "13:10:00", "15:00:00", "c2614", "Web Cleaning,"},
                {"e22cseu1138", "2018-04-20", "2018-04-20", "13:10:00", "16:00:00", "c2615", "Web Cleaning,"},{"e22cseu1139", "2023-04-18", "2023-04-18", "13:10:00", "16:00:00", "c2616", "Web Cleaning,"},
                {"e22cseu1145", "2023-04-10", "2023-04-10", "13:15:00", "16:05:00", "c2616"," Web Cleaning,"},
                {"e22cseu1146", "2023-04-10", "2023-04-10", "13:15:00", "16:50:00", "c2617", "Mosquito Repellent, Web Cleaning, "},
                {"e22cseu1147", "2023-04-10", "2023-04-10", "13:15:00", "16:50:00", "c2617", "Mosquito Repellent, Dusting, "},
                {"e22cseu1148", "2023-04-15", "2023-04-15", "14:15:00", "16:50:00", "c2618", "Mosquito Repellent, Dusting, "}, {"e22cseu1149", "2023-04-15", "2023-04-15", "14:15:00", "16:50:00", "c2618", "Mosquito Repellent, Dusting, "},
                {"e22cseu1150", "2023-04-05", "2023-04-05", "14:15:00", "16:50:00", "c2725", "Mosquito Repellent, "},
                {"e22cseu1151" ,"2023-04-05", "2023-04-05", "14:15:00" ,"16:50:00", "c2725"," Mosquito Repellent,"},

        {"e22cseu1152", "2023-04-06", "2023-04-06", "14:20:00", "16:55:00" ,"c2726", "Web Cleaning, "},
        {"e22cseu1153", "2023-04-06", "2023-04-06", "14:20:00", "16:55:00", "c2726", "Web Cleaning, "},
                {"e22cseu1154", "2023-04-07", "2023-04-07", "14:25:00", "16:00:00", "c2727", "Mosquito Repellent, Sweeping"},
        {"e22cseu1155", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00" ,"c2727", "Mosquito Repellent, Sweeping"},
        {"e22cseu1156", "2023-04-08", "2023-04-08" ,"14:25:00" ,"16:00:00" ,"c2728" , "Mosquito Repellent, Sweeping"},
        {"e22cseu1157", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00", "c2729", "Mosquito Repellent, Dusting, Web Cleaning,"},
                {"e22cseu1158", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00" ,"c2729", "Mosquito Repellent, Dusting, Web Cleaning,"}
        };
        Object[][] data2 = {
                {"f22bu117", "2011-01-20", "2011-01-20", "12:00:00", "14:00:00", "h611", "Mosquito Repellent, Dusting,"},
                {"f22bu118", "2013-01-20", "2013-01-20", "12:50:00", "14:40:00", "h611", "Mosquito Repellent, Dusting, Sweeping"},
                {"f22bu119", "2013-01-20", "2013-01-20", "12:50:00", "14:40:00", "h619", "Mosquito Repellent, Dusting, Sweeping"},
                {"f22bu120", "2014-01-20", "2014-01-20", "13:50:00", "14:40:00", "h620", "Mosquito Repellent, Dusting, Sweeping"},
                {"f22bu121", "2014-05-20", "2014-05-20", "13:55:00", "14:55:00", "h621", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"f22bu122", "2014-05-20", "2014-05-20", "14:55:00", "15:55:00", "h621", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"f22bu123", "2014-05-20", "2014-05-20", "14:55:00", "15:55:00", "h622", "Mosquito Repellent, Web Cleaning, Sweeping"},
                {"f22bu124", "2015-05-20", "2015-05-20", "14:55:00", "15:55:00", "h622","Mosquito Repellent, Dusting,"},
                {"f22bu125","2016-05-20","2016-05-20","14:00:00","15:00:00","h622","Mosquito Repellent,Dusting,Web Cleaning,"},
                {"f22bu126","2016-05-20","2016-05-20","14:05:00","15:05:00","h622","Mosquito Repellent,Dusting,Web Cleaning,"},
                {"f22bu127","2015-05-20","2015-05-20","14:00:00","14:40:00","h623","Dusting,Web Cleaning,"},
                {"f22bu128","2015-05-20","2015-05-20","13:00:00","14:40:00","h623","Dusting,Sweeping"},
                {"f22bu129","2016-05-20","2016-05-20","12:00:00","14:40:00","h624","Dusting,Sweeping"},
                {"f22bu130","2016-05-20","2016-05-20","12:00:00","14:40:00","h624","Mosquito Repellent,"},
                {"f22bu131", "2017-05-20", "2017-05-20", "12:00:00", "14:00:00", "h625", "Mosquito Repellent,"},
                {"f22bu132", "2017-05-20", "2017-05-20", "13:00:00", "14:00:00", "h612", "Mosquito Repellent, Dusting,"},
                {"f22bu133", "2017-04-20", "2017-04-20", "13:00:00", "14:00:00", "h612", "Mosquito Repellent, Dusting,"},
                {"f22bu134", "2017-04-20", "2017-04-20", "13:10:00", "14:00:00", "h613", "Mosquito Repellent, Sweeping,"},
                {"f22bu135", "2017-04-20", "2017-04-20", "13:10:00", "15:00:00", "h613", "Mosquito Repellent, Sweeping"},
                {"f22bu136", "2018-04-20", "2018-04-20", "13:10:00", "15:00:00", "h614", "Web Cleaning, "},
                {"f22bu137", "2018-04-20", "2018-04-20", "13:10:00", "15:00:00", "h614", "Web Cleaning,"},
                {"f22bu138", "2018-04-20", "2018-04-20", "13:10:00", "16:00:00", "h615", "Web Cleaning,"},
                {"f22bu139", "2023-04-18", "2023-04-18", "13:10:00", "16:00:00", "h616", "Web Cleaning,"},
                {"f22bu145", "2023-04-10", "2023-04-10", "13:15:00", "16:05:00", "h616"," Web Cleaning,"},
                {"f22bu146", "2023-04-10", "2023-04-10", "13:15:00", "16:50:00", "h617", "Mosquito Repellent, Web Cleaning, "},
                {"f22bu147", "2023-04-10", "2023-04-10", "13:15:00", "16:50:00", "h617", "Mosquito Repellent, Dusting, "},
                {"f22bu148", "2023-04-15", "2023-04-15", "14:15:00", "16:50:00", "h618", "Mosquito Repellent, Dusting, "},
                {"f22bu149", "2023-04-15", "2023-04-15", "14:15:00", "16:50:00", "h618", "Mosquito Repellent, Dusting, "},
                {"f22bu150", "2023-04-05", "2023-04-05", "14:15:00", "16:50:00", "h725", "Mosquito Repellent, "},
                {"f22bu151" ,"2023-04-05", "2023-04-05", "14:15:00" ,"16:50:00", "h725"," Mosquito Repellent,"},
                {"f22bu152", "2023-04-06", "2023-04-06", "14:20:00", "16:55:00" ,"h726", "Web Cleaning, "},
                {"f22bu153", "2023-04-06", "2023-04-06", "14:20:00", "16:55:00", "h726", "Web Cleaning, "},
                {"f22bu154", "2023-04-07", "2023-04-07", "14:25:00", "16:00:00", "h727", "Mosquito Repellent, Sweeping"},
                {"f22bu155", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00" ,"h727", "Mosquito Repellent, Sweeping"},
                {"f22bu156", "2023-04-08", "2023-04-08" ,"14:25:00" ,"16:00:00" ,"h728" , "Mosquito Repellent, Sweeping"},
                {"f22bu157", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00", "h729", "Mosquito Repellent, Dusting, Web Cleaning,"},
                {"f22bu158", "2023-04-08", "2023-04-08", "14:25:00", "16:00:00" ,"h729", "Mosquito Repellent, Dusting, Web Cleaning,"}
        };

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String query1 = "INSERT INTO ticketstu VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt1 = con.prepareStatement(query1);
            String query2 = "INSERT INTO ticketfac VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt2 = con.prepareStatement(query2);

            for (Object[] row : data1) {
                pstmt1.setString(1, (String) row[0]);
                pstmt1.setDate(2, java.sql.Date.valueOf((String) row[1]));
                pstmt1.setDate(3, java.sql.Date.valueOf((String) row[2]));
                pstmt1.setTime(4, java.sql.Time.valueOf((String) row[3]));
                pstmt1.setTime(5, java.sql.Time.valueOf((String) row[4]));
                pstmt1.setString(6, (String) row[5]);
                pstmt1.setString(7, (String) row[6]);
                pstmt1.addBatch();
            }
            for (Object[] row : data2) {
                pstmt2.setString(1, (String) row[0]);
                pstmt2.setDate(2, java.sql.Date.valueOf((String) row[1]));
                pstmt2.setDate(3, java.sql.Date.valueOf((String) row[2]));
                pstmt2.setTime(4, java.sql.Time.valueOf((String) row[3]));
                pstmt2.setTime(5, java.sql.Time.valueOf((String) row[4]));
                pstmt2.setString(6, (String) row[5]);
                pstmt2.setString(7, (String) row[6]);
                pstmt2.addBatch();
            }

            int[] updateCounts1 = pstmt1.executeBatch();
            int[] updateCounts2 = pstmt2.executeBatch();
            System.out.println("Inserted rows : "+updateCounts1.length+" in ticketstu");
            System.out.println("Inserted rows : "+updateCounts2.length+" in ticketfac");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }