package Session1_Activity1;

public class Car {

    String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	Car()
	{
		tyres = 4;
		doors = 4;
	}
	public void displayCharacteristics()
	{
		System.out.println("Car color - " + color);
		System.out.println("Car make year - " + make);
		 System.out.println("transmission of car - " + transmission);
        System.out.println("car tyres has - " + tyres);
        System.out.println("car doors has - " + doors);
	}
	public void accelarate()
	{
		System.out.println("Car is moving forward");
	}
	public void brake() 
	{
		System.out.println("Car has stopped");
	}
}

