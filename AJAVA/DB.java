//works only in java 7 not in java 8 coz support for odbc is not there
//we are using type 1 drivers here
//dsn:emp
//database name:emp || table name emp_details
import java.sql.*;
public class DB
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
    Connection con = DriverManager.getConnection("jdbc:odbc:emp");
    Statement stmt=con.createStatement();
 
    System.out.println("Before Insertion:");  
    ResultSet rs=stmt.executeQuery("select * from emp_details");  
    while(rs.next())  
     System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    
    int id=106;
    String name="aman";
    int salary=40000;
    stmt.executeUpdate("insert into emp_details(emp_id,emp_name,emp_salary) VALUES('"+id+"','"+name+"','"+salary+"')"); //insertion
    stmt.executeUpdate("update emp_details set emp_salary=100 where emp_id=100"); //updation 
    stmt.executeUpdate("delete from emp_details where emp_id=104");//deletion
    System.out.println("After Insertion");
    rs=stmt.executeQuery("select * from emp_details");
    while(rs.next())
     System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    
    con.close();  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}