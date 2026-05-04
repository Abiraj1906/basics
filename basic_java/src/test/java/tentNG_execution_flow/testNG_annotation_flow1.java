package tentNG_execution_flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_annotation_flow1 {
     
	
	 @BeforeClass
	    public void beforeClass() { System.out.println("BeforeClass - TestClass2"); }

	    @BeforeMethod
	    public void beforeMethod() { System.out.println("BeforeMethod - TestClass2"); }

	    @Test
	    public void test1() { System.out.println("Test1 - TestClass2"); }

	    @AfterMethod
	    public void afterMethod() { System.out.println("AfterMethod - TestClass2"); }

	    @AfterClass
	    public void afterClass() { System.out.println("AfterClass - TestClass2"); }
	
	
}
