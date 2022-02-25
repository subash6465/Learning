import java.util.Scanner;

public class LoopingProgram {
	
	public void performUsingNestedIf(int number1, int number2, int operation)
	{
		if(operation==1)
		{
			System.out.println("Result is : " + (number1+number2));
		}
		
		else if(operation==2)
		{
			System.out.println("Result is : " + (number1-number2));
		}
		
		else if(operation==3)
		{
			System.out.println("Result is : " + (number1/number2));
		}
		
		else if(operation==4)
		{
			System.out.println("Result is : " + (number1*number2));
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		
	}
	
	public void performUsingSwitch(int number1, int number2, int operation)
	{
		switch(operation)
		{
		case 1 :
		{
			System.out.println("Result is : " + (number1+number2));
			break;
		}
		
		case 2 :
		{
			System.out.println("Result is : " + (number1-number2));
			break;
		}
		
		case 3:
		{
			System.out.println("Result is : " + (number1/number2));
			break;
		}
		
		case 4:
		{
			System.out.println("Result is : " + (number1*number2));
			break;
		}
		default :
		{
			System.out.println("Invalid Choice");
		}
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter Number 1 : ");
		Scanner sc=new Scanner(System.in);
		int number1 =sc.nextInt();
		System.out.println("The entered number is - "+number1);
		
		System.out.println("Enter Number 2 : ");
		int number2 =sc.nextInt();
		System.out.println("The entered number is - "+number2);
		
		System.out.println("1 - Add");
		System.out.println("2 - Subract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.println("Choose operation - ");
		int operation=sc.nextInt();
		
		LoopingProgram loop=new LoopingProgram();
		
		System.out.println("Result using Nested If");
		loop.performUsingNestedIf(number1,number2,operation);
		
		System.out.println("Result using switch");
		loop.performUsingSwitch(number1,number2,operation);
		
	}

}
