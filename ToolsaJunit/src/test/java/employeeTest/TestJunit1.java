package employeeTest;

import org.junit.Test;

import employee.MessageUtil;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
	
	   String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message, messageUtil.printMessage());     
	   }

}
