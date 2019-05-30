package LeaningJava;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyFirstJavaProgram {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Logger Logger=org.apache.log4j.Logger.getLogger("MyFirstJavaProgram");
	   PropertyConfigurator.configure("Log4j.properties");

		int x = 80;
		int y = 100;
		System.out.print("value of x  "+x);
		Logger.info("value of x is prineted");
		System.out.print("  value of y  "+y);
		Logger.info("value of x is prineted");
		System.out.print("First Commit successfull");
		
	}
	
	
}
