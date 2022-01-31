import java.sql.*;

public class s20220130 {
    public static void main(String[] Args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/laava/DataGripProjects/SQLite/TJDBC.sqlite");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student;");
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString(3));
                System.out.println();
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
