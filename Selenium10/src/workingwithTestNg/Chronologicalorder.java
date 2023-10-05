package workingwithTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronologicalorder {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("data base connection is started");
		System.out.println("i am before suit");}
	@BeforeClass
	public void beforeclass() {
		System.out.println("to open the browser");
		System.out.println("i am before class");}
	@AfterClass
	public void afterclass() {
		System.out.println("to quit the browser");
		System.out.println("i am after class");}
	@BeforeClass
	public void beforeclass2() {
		System.out.println("to open the browser");
		System.out.println("i am before class2");}
	@AfterClass
	public void afterclass2() {
		System.out.println("to quit the browser");
		System.out.println("i am after class2");}
	
		@Test
		public void Register() {
			System.out.println("Register");
			System.out.println("i am test");}
		@Test
		public void login() {
			System.out.println("login");}
		@AfterSuite
			public void aftersuit() {
			System.out.println("data base connection is stop");
			System.out.println("i am after suit");}
		@BeforeMethod
		public void beformethod() {
		System.out.println("i am before method");
		}
		@AfterMethod
		public void aftermethod() {
		System.out.println("i ma after method");}
		@BeforeMethod
		public void beformethod2() {
		System.out.println("i am before method2");
		}
		@AfterMethod
		public void aftermethod2() {
		System.out.println("i ma after method2");}
		@BeforeTest
		public void befortest() {
		System.out.println("i am before test");
		}
		@AfterTest
		public void aftertest() {
		System.out.println("i ma after test");}
		
	}
	
	


