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
	             //����MySql��������   
	            Class.forName("com.mysql.jdbc.Driver") ;
	            conn = DriverManager.getConnection( url , username , password ) ;
	         } catch (ClassNotFoundException e) {
	             System.out.println("�Ҳ������������� ����������ʧ�ܣ�");   
	             e.printStackTrace();
	         } catch (SQLException e) {
	              System.out.println("���ݿ�����ʧ�ܣ�");   
	             e.printStackTrace();
	         } 
	         
	        return conn ;
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shujuku link=new shujuku();
	}

}
