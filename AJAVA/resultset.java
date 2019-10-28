import java.sql.*;
public class resultset
{
 public static void main(String [] args)
 {
   try
   {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;
    Connection con = DriverManager.getConnection("jdbc:odbc:emp");
    PreparedStatement select=con.prepareStatement("select * from emp_details",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    ResultSet rs=select.executeQuery();
    rs.first();
    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    rs.next();
    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    rs.last();
    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    rs.previous();
    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\n\n");
    rs.moveToInsertRow();
    rs.updateInt("emp_id",106);
    rs.updateString("emp_name","pankaj");
    rs.updateInt("emp_salary",20900);
    rs.insertRow();
    rs.absolute(2);
    rs.updateString("emp_name","suresh");
    rs.updateRow();
    rs.beforeFirst();//rs.refreshRow()
    while(rs.next())
     System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
    con.close();  
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}