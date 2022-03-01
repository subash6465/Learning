import java.util.List;

public class MethodReference {
	
	public static void print(Integer number)
	{
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		.map(s -> s.length()).
		forEach(s -> System.out.println(s));
		
		System.out.println("-----------------");
		
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		.map(s -> s.length()).
		forEach(System.out::println);
		
		System.out.println("-----------------");
		
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		.map(String::length).
		forEach(MethodReference::print);
		
		System.out.println("-----------------");
		
		Integer max=List.of(23,45,67,34).stream().
				filter(n -> n%2 ==0)
				.max((n1,n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);
		
		System.out.println("-----------------");
		
		Integer max1=List.of(23,45,67,34).stream().
				filter(MethodReference::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max1);
	}
		
		public static boolean isEven(Integer number)
		{
			return number%2==0;
		}

}
