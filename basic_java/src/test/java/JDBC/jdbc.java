package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class jdbc {

	public static Properties conpro;
	
	public static void main(String[] args) {
		
		
	   try {
		conpro=new Properties();
		conpro.load(new FileInputStream("/home/sellerp26/Abiraj_project/basic_java/src/test/java/db_config.properties"));
		String url=conpro.getProperty("url");
		String username=conpro.getProperty("username");
		String password=conpro.getProperty("password");
		Connection connection=DriverManager.getConnection(url, username, password);
	Statement std=	connection.createStatement();
	ResultSet rs=	std.executeQuery("Select * from users");

	ResultSetMetaData meta=rs.getMetaData();
	int columncount=meta.getColumnCount();
	
	
	 while (rs.next()) {
		 
		 for(int i=1;i<=columncount;i++) {
		 System.out.println(meta.getColumnName(i)+"   "+rs.getObject(i));
		 
		 
		 }
		//System.out.println(rs.getInt("course_id")+rs.getString("course_name")+rs.getInt("department_id"));
	 }
		rs.close();
		std.close();
		connection.close();
		
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		
		
		
		
		
	
	
	
	
	
	
	

	
}
}
