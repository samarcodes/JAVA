import java.sql.*;  
class TM{  
public static void main(String args[])throws Exception{  
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
Connection con=DriverManager.getConnection("jdbc:odbc:emp");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into emp_details(emp_id,emp_name,emp_salary) VALUES('"+106+"','"+"kusum"+"','"+5500+"')");  
stmt.executeUpdate("insert into emp_details(emp_id,emp_name,emp_salary) VALUES('"+107+"','"+"rama"+"','"+5500+"')");  
System.out.println("Successfully added records");
con.commit();  
con.close();  
}}  