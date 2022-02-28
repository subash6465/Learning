
public class StringArray {

	public static void main(String[] args) {
		
		String[] daysOfWeek= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday"};
		
		String dayWithMoreCharLen=" ";
		for(String day:daysOfWeek)
		{
			if(day.length()>dayWithMoreCharLen.length())
			{
				dayWithMoreCharLen=day;
			}
		}
		System.out.println("Day with more number of characters : " +dayWithMoreCharLen);
		
		for(int i=daysOfWeek.length-1;i>=0;i--)
		{
			System.out.println(" "+daysOfWeek[i]);
		}

	}

}
