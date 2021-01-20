package Session2_Activity1;

class  CustomException extends Exception
{
	 private String msg;
	 public CustomException(String msg)
	 {
		this.msg = msg;
	 }
	 @override
	 public String getMessage()
	 {
		 return msg;
	 }
	
}

public class activity2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            activity2_4.exceptionTest("print to console");
            activity2_4.exceptionTest(null);
            activity2_4.exceptionTest("Cannot execute");
        } catch(CustomException ms) {
            System.out.println("Inside catch: " + ms.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is empty");
        } else {
            System.out.println(str);
        }
	}

}
