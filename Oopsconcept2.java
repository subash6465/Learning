
public class Oopsconcept2 {
	
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	public Oopsconcept2(String make, double radius, String color)
	{
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	public void switchOff()
	{
		this.isOn=false;
		this.setSpeed((byte)0);
		
	}
	
	public void switchOn()
	{
		this.isOn=true;
		this.setSpeed((byte)5);
		
	}
	
	public void setSpeed(byte speed)
	{
		this.speed=speed;
	}
	
	public String toString()
	{
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
				make,radius,color,isOn,speed);
	}

	public static void main(String[] args) {
		
		Oopsconcept2 fan=new Oopsconcept2("Manufacturer 1",0.34567,"Green");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)2);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
}
