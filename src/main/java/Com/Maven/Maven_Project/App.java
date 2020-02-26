package Com.Maven.Maven_Project;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{ 
	static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
     {
    	BasicConfigurator.configure();
    	Scanner sc=new Scanner(System.in);
    	logger.info("Choose which program to run:\n1.Interest\n2.House Construction Cost\n");
    	try {
        int ch=sc.nextInt();
        if(ch==1)
        {
    	   CalcInterest a=new CalcInterest();
        }
        else if(ch==2)
        {
        	HouseCost a=new HouseCost();
        }
        else
        {
        	logger.fatal("Invalid Input\n");
        }
    	}
    	catch(Exception e)
    	{
    		logger.debug("Enter integer only!");
    	}
    	finally {
        sc.close();
    	}
    }
}
