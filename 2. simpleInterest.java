import java.math.BigDecimal;

public class simpleInterest {
	
	BigDecimal principal;
	BigDecimal interest;
	public simpleInterest(String principal, String interest)
	{
		this.principal=new BigDecimal(principal);
		this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(new BigDecimal (noOfYears)));
		return totalValue;
	}
	
public static void main(String args[])
{
	simpleInterest calculator=new simpleInterest("4500.00","7.5");
	BigDecimal totalValue=calculator.calculateTotalValue(5);
	System.out.println(totalValue);
	
}
}
