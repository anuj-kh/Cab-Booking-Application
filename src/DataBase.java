import javax.swing.JOptionPane;
import java.sql.*;

public class DataBase {
    
    public int popup_message(String user) {
        Connection conn = null;
        int flag =0;
        try {
            conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/CABAPPLICATION","root","root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customerdata");
            while(rs.next()){
                String s = rs.getString("username");
                if(s.equals(user)==true){
                    JOptionPane.showMessageDialog(null, "UserID already exist. Please choose something different");
                    return 1;                    
                }
            }          
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
           
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return 0;
    }
    
    public int rows() {
        Connection conn = null;
        try {
            conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/CABAPPLICATION","root","root");
            Statement stmt = (Statement) conn.createStatement();
            
            ResultSet rs;
            rs = stmt.executeQuery("select count(*) as cc from customerdata");
            rs.next();
            return rs.getInt("cc");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void insert_customer(String query) {
        Connection conn = null;
        try {
            conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/CABAPPLICATION","root","root");
            Statement stmt = (Statement) conn.createStatement();
            
            stmt.executeUpdate(query);           
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public int login(String id,String password) {
        Connection conn = null;
        int flag =0;
        try {
            conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/CABAPPLICATION","root","root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customerdata");
            while(rs.next()){
                String a = rs.getString("username");
                String b = rs.getString("password");
                if(a.equals(id)==true && b.equals(password)==true){
                    return 1;                    
                }
            }           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
           
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return 0;
    }
    
}
