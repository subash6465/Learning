import java.math.BigDecimal;

public class Array {
	
	private String name;
	private int[] marks;
	
	public Array(String name, int[] marks) {
		this.name=name;
		this.marks=marks;
	}
	
	private BigDecimal getAverageMarks() {
		int sum=getTotalSumOfMarks();
		int total=getNumberOfMarks();
		return new BigDecimal(sum/total);
	}

	private int getMinimumMark() {
		int min=0;
		for(int i=0;i<marks.length;i++)
		{
			if(i==0)
			{
				min=marks[i];
			}
			else if(marks[i]<min)
			{
				min=marks[i];
			}
		}
		return min;
	}

	private int getMaximumMark() {
		int max=0;
		for(int i=0;i<marks.length;i++)
		{
			if(i==0)
			{
				max=marks[i];
			}
			if(marks[i]>max)
			{
				max=marks[i];
			}
		}
		return max;
	}

	private int getTotalSumOfMarks() {
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		return sum;
	}

	private int getNumberOfMarks() {
		
		return marks.length;
	}

	public static void main(String args[])
	{
		int marks[]= {99,98,100};
		Array student = new Array("Ranga",marks);
		
		System.out.println("Ranga details");
		
		int number=student.getNumberOfMarks();
		System.out.println("number of marks is : " +number);
		
		int sum=student.getTotalSumOfMarks();
		System.out.println("the sum of marks is: " +sum);
		
		int maximumMark=student.getMaximumMark();
		System.out.println("Them maximum mark is : " +maximumMark);
		
		int minimumMark=student.getMinimumMark();
		System.out.println("the minimum mark is : " +minimumMark);
		
		BigDecimal average=student.getAverageMarks();
		System.out.println("the average of marks is : " +average);
		
		int marks1[]= {99,98,100,60};
		Array student1 = new Array("Velan",marks1);
		
		System.out.println("Velan details");
		
		int number1=student1.getNumberOfMarks();
		System.out.println("number of marks is : " +number1);
		
		int sum1=student1.getTotalSumOfMarks();
		System.out.println("the sum of marks is: " +sum1);
		
		int maximumMark1=student1.getMaximumMark();
		System.out.println("Them maximum mark is : " +maximumMark1);
		
		int minimumMark1=student1.getMinimumMark();
		System.out.println("the minimum mark is : " +minimumMark1);
		
		BigDecimal average1=student1.getAverageMarks();
		System.out.println("the average of marks is : " +average1);
	}

	

}
