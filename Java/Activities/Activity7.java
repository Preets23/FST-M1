package activities;


interface BicyclePart{
  public int gears=0;
  public int speed=0;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicyclePart,BicycleOperations{
	public int gears;
	public int speed;
	public Bicycle(int gears,int speed) {
		this.gears=gears;
		this.speed=speed;
	}
	public void applyBrake(int decrement) {
		speed=speed-decrement;
		System.out.println("Current speed is " +speed);
	}
	
	public void speedUp(int increment) {
		speed=speed+ increment;
		System.out.println("Current speed is " +speed);
	}
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
	}
}

class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gears, int speed,int Height) {
		super(gears, speed);
		seatHeight=Height;
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String bicycleDesc() {
	    return(super.bicycleDesc() + "\nseat height is " + seatHeight);
	}
}
public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MountainBike mb=new MountainBike(3,4,5);
	System.out.println(mb.bicycleDesc());
	mb.speedUp(10);
	mb.applyBrake(4);
	}
}
