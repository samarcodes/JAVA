//import java.sql.*;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;
public class rowset
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("jdbc:odbc:emp");
    JdbcRowSet jdbcRS=new JdbcRowSetImpl(con);
    jdbcRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);             
    rws.setCommand("select * from emp_details");  
    rws.execute();  
    while(rws.next()) 
    {  
     System.out.println("Id: " + rws.getInt(1));  
     System.out.println("Name: " + rws.getString(2));  
     System.out.println("Salary: " + rws.getInt(3)); 
    }  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}