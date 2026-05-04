package File_related_testng;

import org.testng.annotations.DataProvider;

public class Dataprovider {

	
	@DataProvider(name="LoginData")
	public Object[][] getLoginData () {
		
		Object[][] object=new Object[3][2];
	
	object[0][0]="admin";
	object[0][1]="admin123";
	
	object[1][0]="balaSC@sellermania.com";
	object[1][1]="test";
	
	object[2][0]="boite.a.musique@wanadoo.fr";
	object[2][1]="test";
	return object;
	
	
		
		
//		
//		return new Object[][] {
//			{"admin", "admin123"},
//            {"user1", "password1"},
//            {"user2", "password2"}
//		};
	}
		
	}
	
		



