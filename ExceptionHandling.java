
public class ExceptionHandling {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");

	}

	private static void method1() {
		method2();
		System.out.println("Method 1 ended");
	}

	private static void method2() {
		try {
		// String s1=null;
		// s1.length();
			int[] i= {1,2};
			int number=i[3];
		System.out.println("Method 2 ended");
		}
		catch(NullPointerException ex)
		{
		System.out.println("matched NullPointerException");
		ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}

}
