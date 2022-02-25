
public class WhileLoop {
	
	int limit;
	
	public WhileLoop(int limit)
	{
		this.limit=limit;
	}
	private void cubeUptoLimit() {
		int i=1;
		while(i*i*i<=limit)
		{
			System.out.print(" "+(i*i*i));
			i++;
		}
		System.out.println(" ");
	}

	private void squareUptoLimit() {
		int i=1;
		while(i*i<=limit)
		{
			System.out.print(" "+(i*i));
			i++;
		}
		System.out.println(" ");
	}

	public static void main(String args[])
	{
		WhileLoop player=new WhileLoop(40);
		
		player.squareUptoLimit();
		
		player.cubeUptoLimit();
		
	}

}
