package Session4_Activity1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     ArrayList<Integer> list = new ArrayList<Integer>();
     Random indexGen = new Random();
     
     System.out.print("Enter integers please ");
     System.out.println("(Integer to terminate): ");
     while(scan.hasNextInt())
     {
    	 list.add(scan.nextInt());
     }
     Integer num[] = list.toArray(new Integer[0]);
     int index = indexGen.nextInt(num.length);
     System.out.println("Index value generated: " + index);
     System.out.println("Value in array at generated index: " + num[index]);

     scan.close();
     
     
	}

}


