
public class Book {
	
	int noOfCopies;
	
	void pull()
	{
		System.out.println("Book is retrived");
	}

	public static void main(String[] args) {
		Book artOfComputerProgramming=new Book();
		Book effectiveJava=new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.pull();
		effectiveJava.pull();
		cleanCode.pull();
		
		artOfComputerProgramming.noOfCopies=100;
		effectiveJava.noOfCopies=80;
		cleanCode.noOfCopies=75;

	}

}
