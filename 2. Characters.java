
public class Characters {
	
	private char ch;

	public Characters(char ch)
	{
		this.ch=ch;
	}
	public boolean isVowel() {
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			return true;
		}
		else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public boolean isDigit()
	{
		if(ch>=48 && ch<=57) //48 is value of 0 & 58 is value of 9 
		return true;
		
		return false;
	}
	public boolean isAlphabet()
	{
		if(ch>=97 && ch<=122) //97-value of a & 122-value of z
			return true;
		if(ch>=65 && ch<=90) //65-value of a & 90-value of z
			return true;
		
		return false;
	}
	public boolean isConsonant() {
		if(isAlphabet() && !isVowel())
			return true;
			
		
		return false;
	}
	
	public static void printupperCase() {
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
		
	}
	public static void printLowerCase() {
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		}
	}
	
	public static void main(String args[])
	{
		Characters mychar=new Characters('6');
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		System.out.println(mychar.isConsonant());
		Characters.printLowerCase();
		Characters.printupperCase();
	}
}
