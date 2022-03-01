import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class SetExercise {

	public static void main(String[] args) {
		List <Character> characters = List.of('A','Z','A','B','Z','F');
		
		Set<Character> treeSet=new TreeSet<>(characters);
		System.out.println("Tree Set : " +treeSet);

		Set<Character> linkedHash=new LinkedHashSet<>(characters);
		System.out.println("Linked Hast Set : " +linkedHash);
		
		Set<Character> hashSet=new HashSet<>(characters);
		System.out.println("Linked Hast Set : " +hashSet);

	}

}
