import java.sql.*;
public class DBConn {

private String url = "jdbc:mysql://localhost:3306/emp";
private String driver = "com.mysql.jdbc.Driver";
private String userName = "root";
private String password = "adminlab";
private Connection con = null;

private void getConnection() {

     try {
         Class.forName(driver);
         if(con == null){
             con = DriverManager.getConnection(url,userName,password);
         }
         System.out.print("Connection estd");
     }catch (Exception e) {
         System.out.print("Error : " +e.getMessage());
    }
}


/**for desktop application */
public static void main(String[] arg){

    DBConn con = new DBConn();
    con.getConnection();
  }
}