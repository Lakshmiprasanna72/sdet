package Session2_Activity1;

interface BicycleParts {
    public int gears = 0;
    public int maxSpeed = 0;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int maxSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.maxSpeed = maxSpeed;
    }

    public void applyBrake(int decrement) {
        maxSpeed -= decrement;
        System.out.println("Current Speed: " + maxSpeed);
    }

    public void speedUp(int increment) {
        maxSpeed += increment;
        System.out.println("Current speed: " + maxSpeed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nand Speed of bicycle is " + maxSpeed);
    }
}

class MountainBike extends Bicycle 
    {
    public int seatHeight;

    public MountainBike(int gears, int maxSpeed, int startHeight) {
        super(gears, maxSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

public class activity2_3 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(4, 90, 30);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}

