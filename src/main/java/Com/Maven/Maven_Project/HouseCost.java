package Com.Maven.Maven_Project;
import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class HouseCost {
	  static final Logger logger = LogManager.getLogger(App.class);
       Scanner sc=new Scanner(System.in);
        double sqfeet;
        HouseCost()
        {
        	 logger.info("Enetr No Of Square Feets");
        	 try {
        	 sqfeet=sc.nextDouble();
        	 logger.info("choose Category of Material\n1.Standard Material\n2.Above Standard <Material\n3.High Standard Material");
        	 logger.warn("Enter value in range 1 to 3");
        	 int ch=sc.nextInt();
        	 switch(ch)
        	 {
        	 case 1: logger.info("Total Construction Cost:"+(sqfeet*1200)+"Rs");
        	         break;
        	 case 2: logger.info("Total Construction Cost:"+(sqfeet*1500)+"Rs");
	                 break;
        	 case 3: logger.info("Choose fully automated or not:\n1.Fully automated\n2.Not Fully automated");
        	         logger.warn("enter value 1 or 2");
        	         try {
        	         int x=sc.nextInt();
        	         if(x==1)
        	         {
        	        	 logger.info("Total Construction Cost:"+(sqfeet*2500)+"Rs");
   
        	         }
        	         else if(x==2)
        	         {
        	        	 logger.info("Total Construction Cost:"+(sqfeet*1800)+"Rs");
        	         }
        	         else
        	         {
        	        	 logger.fatal("Invalid Input");
            	      
        	         }
        	         }
        	         catch(Exception e)
        	         {
        	        	 logger.debug("Enter integer only");
        	         }
        	         break;
        	   default:logger.fatal("Invalid Input");
        	 }
        	 }
        	 catch(Exception e)
        	 {
        		 logger.debug("Enter sqfeet in specified format");
        	 }
        	 
        }
}
