package tentNG_execution_flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_annotation_flow {

	 @BeforeSuite
	    public void beforeSuite() { System.out.println("BeforeSuite"); }

	    @BeforeTest
	    public void beforeTest() { System.out.println("BeforeTest"); }

	    @BeforeClass
	    public void beforeClass() { System.out.println("BeforeClass - TestClass1"); }

	    @BeforeMethod
	    public void beforeMethod() { System.out.println("BeforeMethod - TestClass1"); }

	    @Test
	    public void test1() { System.out.println("Test1 - TestClass1"); }

	    @Test
	    public void test2() { System.out.println("Test2 - TestClass1"); }

	    @AfterMethod
	    public void afterMethod() { System.out.println("AfterMethod - TestClass1"); }

	    @AfterClass
	    public void afterClass() { System.out.println("AfterClass - TestClass1"); }

	    @AfterTest
	    public void afterTest() { System.out.println("AfterTest"); }

	    @AfterSuite
	    public void afterSuite() { System.out.println("AfterSuite"); }
	

	
}
