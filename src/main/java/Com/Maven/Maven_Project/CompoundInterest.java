package Com.Maven.Maven_Project;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class CompoundInterest extends SimpleInterest{
	static final Logger logger = LogManager.getLogger(App.class);
	   int NoOfTimes;
	   double Total_Amount;
      CompoundInterest()
      {
    	  EnterPrincipalAmount();
  		  EnterInterest();
  		  EnterNoOfYears();
  		  CalculateInterest();
  		  TotalAmount();
      }
      public void EnterNoOfTimes()
      {
    	  try {
    	  logger.info("Enter No Of times interest is computed anually");
    	  NoOfTimes=sc.nextInt();
    	  }
    	  catch(Exception e)
  		  {
  			logger.debug("Enter correct input in integer format");
  		  }
      }
      public void CalculateInterest()
      {
    	  EnterNoOfTimes();
    	  Total_Amount=PrincipalAmount;
    	  for(int i=1;i<=NoOfTimes*NoOfYears;i++)
    	  {
    		  Total_Amount=Total_Amount*(1+(RateOfInterest/(100*NoOfTimes)));
    	  }
    	  InterestAmount=Total_Amount-PrincipalAmount;
  		  logger.info("Interest Amount ="+InterestAmount+"\n");
      }
      public void TotalAmount()
  	 {
  	 	logger.info("Total amount after "+NoOfYears+" Years is :"+Total_Amount+"\n");
  	 }
      
}
