import java.sql.*;
public class DB1
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver") ;
    String path="C:\\Kalra\\database\\samar.accdb";
    String url="jdbc:ucanaccess://"+path;
    Connection con = DriverManager.getConnection(url);
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from emp_details");  
    while(rs.next())  
     System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    con.close();  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}