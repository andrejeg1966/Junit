package employeeTest;



import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import employee.MessageUtil;

public class TestJunit {
	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   //@Ignore
	   @Test(timeout = 1000)
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = "Robert";
	      assertEquals(message,messageUtil.printMessage());
	   }
	   
	   @Test(expected = ArithmeticException.class)
	   public void testPrintMessageExpected() {	
		      System.out.println("Inside testPrintMessage()");     
		      messageUtil.printMessage();     
		   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }

}
