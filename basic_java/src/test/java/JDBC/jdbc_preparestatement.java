package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

import org.testng.annotations.Test;

public class jdbc_preparestatement {

	public static Properties conpro;
	
	@Test
	
	public void prepare_statement() {
		
		 try {
				conpro=new Properties();
				conpro.load(new FileInputStream("/home/sellerp26/Abiraj_project/basic_java/src/test/java/db_config.properties"));
				String url=conpro.getProperty("url");
				String username=conpro.getProperty("username");
				String password=conpro.getProperty("password");
		Connection conn=DriverManager.getConnection(url, username, password);
		PreparedStatement ps=conn.prepareStatement("select * from  users where user_id=? and username=? ;");
		ps.setInt(1, 1);
		ps.setString(2, "abiraj");
		
		ResultSet rs=ps.executeQuery();

//		while(rs.next()) {
//		System.out.println(rs.getInt("user_id")+"  "+rs.getString("username")+"  "+rs.getString("email")+"  "+rs.getString("created_at"));
//		}
		ResultSetMetaData meta=rs.getMetaData();
		int columncount=meta.getColumnCount();
		
		while(rs.next()) {
			
		for(int i=1;i<=columncount;i++) {
			
			System.out.println(meta.getColumnName(i)+"   "+rs.getObject(i));
		
		}	
		}
			
		rs.close();
		ps.close();
		conn.close();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
