
public class Multiplication_table {
	void print()
	{
		print(5, 1, 10);
	}
	void print(int table)
	{
		print(table, 1, 10);
	}
	void print(int table, int start, int end)
	{
		for(int i=start;i<=end;i++)
		{
			System.out.printf("%d X %d = %d",table,i,i*table).println();
		}
		System.out.println("\n");
	}
	public static void main(String args[])
	{
		Multiplication_table table=new Multiplication_table();
		table.print();
		table.print(10);
		table.print(20,1,20);
	}

}
