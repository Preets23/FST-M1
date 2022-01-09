package activities;

@SuppressWarnings("serial")
class CustomException extends Exception{
	private String message ="Custom Exception";
	CustomException(String error){
		this.message=error;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Activity8.exceptionTest("Print to console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Wont Execute");
		}
		catch(CustomException ca)
		{
		System.out.println("Catch Block "+ca.getMessage());	
		}
	}
	
	
	static void exceptionTest(String str) throws CustomException{
	if(str==null)
	{
		throw new CustomException("String is null");
	}
	else {
		System.out.println(str);
	}
	}

}
