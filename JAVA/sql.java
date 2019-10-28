import java.sql.*;
import java.util.*;  
class sql{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","adminlab");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from employee");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)); 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
} 