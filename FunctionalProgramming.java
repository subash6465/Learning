import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<String>list=List.of("Apple","Banana","Cat","Dog");
		
		List<Integer>list1=List.of(1,9,2,8,3,7,4,6,5);
		
		System.out.println("without functional programming");
		printBasic(list);
		System.out.println("with functional programming");
		printWithFP(list);
		System.out.println("Filtering without functional programming");
		printBasicWithFiltering(list);
		System.out.println("Filtering with functional programming");
		printWithFPFiltering(list);
		System.out.println("Printing odd numbers without functional programming");
		printodd(list1);
		System.out.println("Printing odd numbers with functional programming");
		printOddNumberWithFP(list1);
		System.out.println("Printing Sum of numbers without functional programming");
		printsum(list1);
		System.out.println("Printing Sum of numbers with functional programming");
		printSumWithFP(list1);
		System.out.println("Printing Sum of odd numbers without functional programming");
		printsumOfOdd(list1);
		System.out.println("Printing Sum of odd numbers with functional programming");
		printSumOfOddNumberWithFP(list1);
		System.out.println("Printing sorted list with functional programming");
		printSortNumberWithFP(list1);
		System.out.println("Printing square of the sorted list with functional programming");
		printSquareOfSortNumberWithFP(list1);
		
		
	}
	
	private static void printBasic(List<String> list)
	{
		for(String string:list)
		{
			System.out.println(string);
		}
	}
	
	private static void printBasicWithFiltering(List<String> list)
	{
		for(String string:list)
		{
			if(string.endsWith("at"))
			{
			System.out.println(string);
			}
		}
	}
	
	private static void printodd(List<Integer> list1)
	{
		for(Integer number:list1)
		{
			if(number%2==1)
			{
			System.out.println(number);
			}
		}
	}
	
	private static void printsum(List<Integer> list1)
	{
		int sum=0;
		for(Integer number:list1)
		{
			sum+=number;
		}
		System.out.println(sum);
	}
	
	private static void printsumOfOdd(List<Integer> list1)
	{
		int sum=0;
		for(Integer number:list1)
		{
			if(number%2==1)
			{
			sum+=number;
			}
		}
		System.out.println(sum);
	}
	
	private static void printWithFP(List<String> list)
	{
		list.stream().forEach(
				element -> System.out.println(element));
	}
	
	private static void printWithFPFiltering(List<String> list)
	{
		list.stream()
		.filter(element -> element.endsWith("at"))
		        .forEach(
				element -> System.out.println(element));
	}
	
	private static void printOddNumberWithFP(List<Integer> list1)
	{
		list1.stream()
		.filter(element -> element%2 == 1)
		        .forEach(
				element -> System.out.println(element));
	}
	
	private static void printSumWithFP(List<Integer> list1)
	{
		int sum=list1.stream().reduce(
				0,(number1,number2) -> number1 + number2);
		System.out.println(sum);
	}
	
	private static void printSumOfOddNumberWithFP(List<Integer> list1)
	{
		int sum=list1.stream().
				filter(element -> element%2 == 1).reduce(
						0,(number1,number2) -> number1 + number2);
		System.out.println(sum);
	}
	
	private static void printSortNumberWithFP(List<Integer> list1)
	{
		list1.stream().sorted().
		forEach(e -> 
		System.out.println(e));
	}
	
	private static void printSquareOfSortNumberWithFP(List<Integer> list1)
	{
		list1.stream().sorted().map(e -> e*e).
		forEach(e -> 
		System.out.println(e));
	}

}
