package activities;

public class Activity1 {
public static void main(String[] args) {
  
  Car Volvo = new Car();
  Volvo.make= 2014;
  Volvo.color="Black";
  Volvo.transmission="Manual";
  
  Volvo.displayCharacteristics();
  Volvo.accelarate();
  Volvo.brake();
	}
}

class Car{ 
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	void displayCharacteristics() {
		System.out.println("Car Color = " +color);
		System.out.println("Car Make = " +make);
		System.out.println("Car Transmission = " +transmission);
		System.out.println("Car Tyres = " +tyres);
		System.out.println("Car Doors = " +doors);
		
	}
	void accelarate()
	{
		System.out.println("Car is moving forward");
	}
	 void brake() {
		 System.out.println("Car has stopped");
	 }
}