import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {

	public static void main(String[] args) {
		String str="This is an awsome occasion. " + "This has never happened before.";
		
		Map<Character,Integer> occurances = new HashMap<>();
		
		char[] characters=str.toCharArray();
		for(char character:characters)
		{
			Integer integer=occurances.get(character);
			if(integer==null)
			{
				occurances.put(character,1);
			}
			else
			{
				occurances.put(character, integer+1);
			}
		}
		System.out.println(occurances);
		
Map<String,Integer> StringOccurances = new HashMap<>();
String[] words=str.split(" ");
		
		
		for(String word:words)
		{
			Integer integer=StringOccurances.get(word);
			if(integer==null)
			{
				StringOccurances.put(word,1);
			}
			else
			{
				StringOccurances.put(word, integer+1);
			}
		}
		System.out.println(StringOccurances);

	}

}