package Session3_Activity1;
import java.util.HashSet;

public class activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           HashSet<String> hs = new HashSet<String>();
           hs.add("A");
           hs.add("B");
           hs.add("C");
           hs.add("D");
           hs.add("E");
           hs.add("F");
           System.out.println("Print HashSet:"+ hs);
           System.out.println("Size of HashSet:"+ hs.size());
           
           hs.remove("F");
           if(hs.remove("P"))
           {
           	System.out.println("Z removed from the Set");
        	
           } else {
   	
           	System.out.println("Z is not present in the Set");
   	
           }
           System.out.println("Is M in the hash set:" + hs.contains("M"));
           
           System.out.println("Print the updated hash set:" + hs);
           }
           
	}

