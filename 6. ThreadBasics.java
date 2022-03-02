

class Task1 extends Thread
{
	public void run()
	{
		System.out.println("\n Task 1 started");
		for(int i=101;i<=199;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n Task 1 completed");
	}
}

class Task2 implements Runnable
{

	@Override
	public void run() {
		System.out.println("\n Task 2 started");
		for(int i=201;i<=299;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n Task 2 completed");
		
	}
	
}
public class ThreadBasics {
	

	public static void main(String[] args) throws InterruptedException {
		Task1 task1=new Task1();
		task1.setPriority(1);
		task1.start();
		
/*System.out.println("Task 1 started");
		
		for(int i=101;i<=199;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("Task 1 completed");*/
		
		Task2 task2=new Task2();
		Thread thread = new Thread(task2);
		task1.setPriority(10);
		thread.start();
		
		/*System.out.println("Task 2 started");
		
		for(int i=201;i<=299;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("Task 2 completed");*/
		
		task1.join();
		
System.out.println("\n Task 3 started");
		
		for(int i=301;i<=399;i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n Task 3 completed");
		System.out.println("\n Main completed");
	}
}
