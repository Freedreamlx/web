package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.types;
import until.shujuku;
public class TypeDao {
	public types select(String name){//ͨ���û�����ѯ
		Connection con=shujuku.getConnection();
		types type=null;
		int i=0;
		 try {  
	            // ��ѯ���ݵ�sql���  
	            String sql = "select * from lionell.stu where name=?";   
	            java.sql.PreparedStatement ps=con.prepareStatement(sql);
	            ps.setString(1, name);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) { // �ж��Ƿ�����һ������  
	                // �����ֶ�����ȡ��Ӧ��ֵ 
	            	int id=Integer.parseInt(rs.getString("id"));
	            	String teacher1 = rs.getString("teacher1");
	            	String teacher2 = rs.getString("teacher2");
	            	String student1 = rs.getString("student1");
	            	String student2 = rs.getString("student2");
	            	String address=rs.getString("address");
	            	System.out.println(address);
	            	type=new types(id,name,teacher1,teacher2,student1,student2,address);
	            
	            }
	            
	            ps.close();  
	            con.close(); 
		 } catch (SQLException e) {  
			 System.out.println(e.getMessage());
		 }
		 return type;
	}
	public void update(types type,int id){//�������ݣ�ͨ��id�����޸��������ݣ��ӿ���Ҫid��
										//type����������
		Connection con=shujuku.getConnection();
		try{
			String sql="update lionell.stu set name=?,teacher1=?,teacher2=?,student1=?,student2=?,address=? where id=?";
		    java.sql.PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1, type.getName());		
			ps.setString(2, type.getTeacher1());
			ps.setString(3, type.getTeacher2());
			ps.setString(4, type.getStudent1());
			ps.setString(5, type.getStudent2());
			ps.setString(6, type.getAdress());
			ps.setInt(7, id);
			ps.executeUpdate();
			System.out.println(type.getAdress());
			ps.close();  
	        con.close(); 
	        System.out.println("chenggogn");
		}catch (SQLException e1) {  
            System.out.println("��������ʧ��"); 
            System.out.println(e1.getMessage());
        }  

		
	}
	public void insert(types type){//��Ҫһ��type�ĳ�id�������������
		Connection con=shujuku.getConnection();
		try{
			String sql="INSERT INTO lionell.stu VALUES (?,?,?,?,?,?,?)";  
			java.sql.PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, type.getId());
			ps.setString(2, type.getName());
			ps.setString(3, type.getTeacher1());
			ps.setString(4, type.getTeacher2());
			ps.setString(5, type.getStudent1());
			ps.setString(6, type.getStudent2());
			ps.setString(7, type.getAdress());
			ps.executeUpdate();

			ps.close();  
	        con.close(); 	     
		}catch (SQLException e) {
            e.printStackTrace();
            System.out.println("��������ʧ��" + e.getMessage());
		}

	}
	public void delete(String name){//��Ҫ����
		Connection con=shujuku.getConnection();
		 try {  
	            // ɾ�����ݵ�sql���  
	            String sql = "delete from lionell.stu  where name=?";   
	            java.sql.PreparedStatement ps=con.prepareStatement(sql);
	            ps.setString(1, name);
	            ps.execute();
	            ps.close();  
	            // �ر����ݿ�����  
	            con.close();   
	        } catch (SQLException e) {  
	            System.out.println(e.getMessage());  
	        }  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeDao test=new TypeDao();
		types type=new types(8,"mmp","sjjs","jfdjk","jfsdkj","eiw","www.dfj.com");
		//test.delete("messi");
		//test.insert(type);
       test.update(type, 7);
		
	}

}

