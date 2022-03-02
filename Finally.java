import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scanner=null;
		try
		{
		scanner=new Scanner(System.in);
		
		int [] number = {1,2,3,4,5};
		
		int numbers = number[21];
		System.out.println("Before scanner close");
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(scanner!=null)
			{
			scanner.close();
			System.out.println("scanner closed");
			}
		}
		System.out.println("main end");

	}

}