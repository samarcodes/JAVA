//works only in java 7 not in java 8 coz support for odbc is not there
//we are using type 1 drivers here
//dsn:emp
//database name:emp || table name emp_details
import java.sql.*;
public class preparedstmt
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
    Connection con = DriverManager.getConnection("jdbc:odbc:emp");
    
    PreparedStatement select=con.prepareStatement("select * from emp_details");
    ResultSet rs=select.executeQuery();
    
    PreparedStatement insert=con.prepareStatement("insert into emp_details(emp_id,emp_name,emp_salary) values(?,?,?)");
    
    insert.setInt(1,106);
    insert.setString(2,"raman");
    insert.setInt(3,40000);  
    int i=insert.executeUpdate();
 
    System.out.println(i+" Record Added");

    /*PreparedStatement update=con.prepareStatement("update emp_details set emp_salary= ? where emp_id= ? ");
    update.setInt(1,10);
    update.setInt(2,100);
    update.executeUpdate();
    System.out.println(i+" Updated Successfully");
   
    PreparedStatement delete=con.prepareStatement("delete from emp_details where emp_id =104");
    delete.executeUpdate();
    System.out.println(i+" Deleted Successfully");
    */
    while(rs.next())
     System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        	 
    con.close();  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}