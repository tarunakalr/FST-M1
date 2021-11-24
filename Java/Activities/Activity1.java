package activities;

public class Activity1 {

	public static void main(String[] args) {
		
		Car obj1= new Car();
		
		obj1.make=2014;
		obj1.color= "black";
		obj1.transmission="Manual";
		
		obj1.displayCharacterstics();
		obj1.accelarate();
		obj1.brake();
		
		
		

	}

}

class Car
{
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car()
	{
		tyres=4;
		doors=4;
	}
	
	
	//Method
			public void displayCharacterstics()
			{
				System.out.println("Color of the car is " + color);
				System.out.println(" Make of the car is " + make);
				System.out.println("Transamission of car is "+ transmission);
				System.out.println("Number of doors in car is" + doors);
				System.out.println("Number of Tyres in car is" + tyres);
				
			}
				
				
	
				
			
			//Method 2 
			void accelarate()
			{
				System.out.println("Car is accelrating");
			}
			
			void brake()
			{
				System.out.println("Car is Stopped");	
			}
			

	
}
