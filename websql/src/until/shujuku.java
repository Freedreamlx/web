package until;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class shujuku {
	private static String  url = "jdbc:mysql://139.199.110.234:3306/shiwu?useUnicode=true&characterEncoding=utf8" ;    
	private static String username = "root" ;   
	private static String password = "123456" ;   
	
     private static Connection conn ;
	 
	    public static Connection getConnection(){
	        
	         try {
	             //加载MySql的驱动类   
	            Class.forName("com.mysql.jdbc.Driver") ;
	            conn = DriverManager.getConnection( url , username , password ) ;
	         } catch (ClassNotFoundException e) {
	             System.out.println("找不到驱动程序类 ，加载驱动失败！");   
	             e.printStackTrace();
	         } catch (SQLException e) {
	              System.out.println("数据库连接失败！");   
	             e.printStackTrace();
	         } 
	         
	        return conn ;
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shujuku link=new shujuku();
	}

}
