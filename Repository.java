import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Repository {
    
    public void SelectAll(){
        Student student;
        List<Student>studentList = new ArrayList<>();
        String sql = "SELECT * FROM tableStudent";
        
        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
            
            System.out.println("Student ID \t Name \t BirthDate \t Age \t Gender \t Course \t YearLevel \t Email \t ContactNumber \t Address");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            
            while (rs.next()){
                System.out.println(rs.getString("studentID") + '\t' + 
                        rs.getString("name")  + '\t' +
                        rs.getString("birthDate") + '\t' + 
                        rs.getString("age") + '\t' + 
                        rs.getString("gender") + '\t' + 
                        rs.getString("course") + '\t' + 
                        rs.getString("yearLevel") + '\t' + 
                        rs.getString("email") + '\t' + 
                        rs.getString("contactNumber") + '\t' + 
                        rs.getString("address"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public Connection connect(){
        String url = "jdbc:sqlite:Studentss.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
} 