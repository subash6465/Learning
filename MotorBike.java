
public class MotorBike {
	
	void setSpeed(int speed)
	{
		System.out.println(speed);
	}
	
	void start()
	{
		System.out.println("Bike Started");
	}

	public static void main(String args[])
	{
		MotorBike ducati=new MotorBike();
		MotorBike honda=new MotorBike();
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		honda.setSpeed(50);
		
		ducati.setSpeed(20);
		honda.setSpeed(5);
		
	}
}
