package Com.Maven.Maven_Project;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class SimpleInterest implements Interest {
	static final Logger logger = LogManager.getLogger(App.class);
	Scanner sc=new Scanner(System.in);
	double PrincipalAmount;
	double NoOfYears;
	double RateOfInterest;
	double InterestAmount;
	SimpleInterest()
	{
		EnterPrincipalAmount();
		EnterInterest();
		EnterNoOfYears();
		CalculateInterest();
		TotalAmount();
	}
	public void EnterInterest()
	{
		try {
		logger.info("Enter Rate ofInterest per Year");
		RateOfInterest=sc.nextDouble();
		}
		catch(Exception e)
		{
			logger.debug("Enter correct input in double format");
		}
	}
	public void EnterNoOfYears()
	{
		try {
		logger.info("Enter No Of Years");
		NoOfYears=sc.nextDouble();
		}
		catch(Exception e)
		{
			logger.debug("Enter correct input in double format");
		}
	}
	public void EnterPrincipalAmount()
	{
		try {
		logger.info("Enter Principal Amount");
		PrincipalAmount=sc.nextDouble();
		}
		catch(Exception e)
		{
			logger.debug("Enter correct input in double format");
		}
	}
	public void CalculateInterest()
	{
		InterestAmount=(PrincipalAmount*RateOfInterest*NoOfYears)/100;
		logger.info("Interest Amount ="+InterestAmount+"\n");
	}
	public void TotalAmount()
	{
		logger.info("Total amount after "+NoOfYears+" Years is :"+(PrincipalAmount+InterestAmount)+"\n");
	}

}
