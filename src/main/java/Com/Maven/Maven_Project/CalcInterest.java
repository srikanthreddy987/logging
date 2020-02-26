package Com.Maven.Maven_Project;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


public class CalcInterest {
	static final Logger logger = LogManager.getLogger(App.class);
      Scanner sc=new Scanner(System.in);
      CalcInterest()
      {
    	  logger.info("Select type of Interest\n1.Simple Interest\n2.Compound Interest");
    	  logger.warn("enter value 1 or 2");
    	  try {
    	  int x=sc.nextInt();
    	  if(x==1)
    	  {
    		  SimpleInterest a=new SimpleInterest();
    	  }
    	  else if(x==2)
    	  {
    		  CompoundInterest b=new CompoundInterest();
    	  }
    	  else
    		  logger.fatal("Invalid Input");
    	  }
    	  catch(Exception e)
    	  {
    		  logger.debug("Enter integer only");
    	  }
      }
}
