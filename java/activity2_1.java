package Session2_Activity1;

abstract class Book{
	String title;
	public void setTitle(String s)
	{
		title =s;
	}
	String getTitle() {
	return title;
	}
}
class MyBook extends Book
{
	public void setTitle(String s)
	{
		title =s;
	}
}
public class activity2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String title = "Wings of Fire";
	  Book newNovel = new MyBook();
	  newNovel.setTitle(title);
	  System.out.println("Displaying the name of the Book:" + newNovel.getTitle());
	}

}
