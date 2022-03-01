import java.util.ArrayList;
import java.util.List;

public class GenericsExercise<T> {
	
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element)
	{
		list.add(element);
	}
	
	public void removeElement(T element)
	{
		list.remove(element);
	}
	
	public String toString()
	{
		return list.toString();
	}
	
	public T get(int index) {
		
		return list.get(index);
	}
	
	static <T extends List> void duplicate(T list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number>numbers)
	{
		double sum=0.0;
		for(Number number:numbers)
		{
			sum+=number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		GenericsExercise<String> list = new GenericsExercise<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value=list.get(0);
		
		System.out.println(list);
		System.out.println(value);
		
		GenericsExercise<Integer> list1 = new GenericsExercise<>();
		list1.addElement(Integer.valueOf(5));
		list1.addElement(Integer.valueOf(7));
		Integer value1=list1.get(0);
		
		System.out.println(list1);
		System.out.println(value1);
		
		GenericsExercise<Character> list2 = new GenericsExercise<>();
		list2.addElement('A');
		list2.addElement('B');
		list2.addElement('C');
		Character value2=list2.get(0);

		System.out.println(list2);
		System.out.println(value2);
		
		ArrayList<Integer> numbers=new ArrayList<>(List.of(1,2,3));
		duplicate(numbers);
		System.out.println(numbers);
		
		
		System.out.println("Sum of list with Integers are "
		                     +sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println("Sum of list with double values are "
		                     +sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5)));
	}
}
