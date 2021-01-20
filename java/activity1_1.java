package Session1_Activity1;

public class activity1_1 {
	public static void main(String[] args)
	{
		Car a = new Car();
		a.color = "White";
		a.make = 2020;
		a.transmission = "Manual";
		
		a.displayCharacteristics();
		a.brake();
		a.accelarate();
	}
}
