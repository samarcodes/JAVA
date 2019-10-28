import java.sql.*;
public class metadata
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
    Connection con = DriverManager.getConnection("jdbc:odbc:emp");
    PreparedStatement ps=con.prepareStatement("select * from emp_details");  
    ResultSet rs=ps.executeQuery();  
    ResultSetMetaData rsmd=rs.getMetaData();  
  
    System.out.println("Total columns: "+rsmd.getColumnCount());  
    System.out.println("1st column: "+rsmd.getColumnName(1));  
    System.out.println("Type of 1st column: "+rsmd.getColumnTypeName(1));  
    System.out.println("2nd column: "+rsmd.getColumnName(2));  
    System.out.println("Type of 2nd column: "+rsmd.getColumnTypeName(2));
    System.out.println("3rd column: "+rsmd.getColumnName(3));  
    System.out.println("Type of 3rd column: "+rsmd.getColumnTypeName(3));
    con.close();  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}