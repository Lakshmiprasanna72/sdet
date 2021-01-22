package Session3_Activity1;
import java.util.ArrayList;

public class activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> myList = new ArrayList<String>();
         
         myList.add("Brinjal");
         myList.add("Tomato");
         myList.add("Potato");
         //adding at specific index
         myList.add(1,"Cucumber");
         myList.add(3,"Raddish");
         
         System.out.println("Print all objects");
         for(String s:myList)
         {
        	 System.out.println(s);
         }
         System.out.println("3rd element in the list is:" +myList.get(2));
         System.out.println("Is Egg there in the list:" +myList.contains("Egg"));
         System.out.println("Size of the list is:" +myList.size());
         
         myList.remove("Cucumber");
         System.out.println("Print all objects");
         for(String s:myList)
         {
        	 System.out.println(s);
         }
         
         System.out.println("New size of the list is:" +myList.size());
               
   
	}

}
