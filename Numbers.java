
public class Numbers {
	
	private int number;
	
	public Numbers(int number) {
		this.number=number;
	}
	
	public boolean isPrime()
	{
		if(number<2)
		{
			return false;
		}
		for(int i=2;i<=number-1;i++)
		{
		if(number%i==0)
		{
		return false;
		}
		}
		return true;
	}
	
	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	public int sumOfDivisors() {
		int sumOfDivisors=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
			sumOfDivisors=sumOfDivisors+i;
			}
		}
		return sumOfDivisors;
	}

	private void printAnTriangle() {
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public static void main(String args[])
	{
		Numbers number = new Numbers(10);
		
		boolean isPrime=number.isPrime();
		System.out.println("isPrime "+isPrime);
		
		int sum=number.sumUptoN();
		System.out.println("sum upto N "+sum);
		
		int sumOfDivisors=number.sumOfDivisors();
		System.out.println("sum of divisors "+sumOfDivisors);
		
		number.printAnTriangle();
		
	}
}
