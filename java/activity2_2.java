package Session2_Activity1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane
{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	 public void onBoard(String passenger) {
	        this.passengers.add(passenger);
	    }

	    public Date takeOff() {
	        this.lastTimeTookOf = new Date();
	        return lastTimeTookOf;
	    }

	    public void land() {
	        this.lastTimeLanded = new Date();
	        this.passengers.clear();
	    }

	    public Date getLastTimeLanded() {
	        return lastTimeLanded;
	    }

	    public List<String> getPassengers() {
	        return passengers;
	    }
	}

public class activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane = new Plane(10);
		plane.onBoard("Lakshmi");
		plane.onBoard("Prasanna");
		plane.onBoard("Dhoni");
		plane.onBoard("Warner");
		System.out.println("Plane took of at:"+plane.takeOff());
		System.out.println("Passengers on the Plane are:"+plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at"+ plane.getLastTimeLanded());
	}

}
