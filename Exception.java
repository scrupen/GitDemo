
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
//		int d = 499/0;
//		System.out.println(d);
			System.out.println("Beginning");
			System.out.println("Error");
			System.out.println("occurs");
			System.out.println("next");

		int divide = 10/0;
		System.out.println(divide);
		}catch(Throwable t){
			System.out.println("Error Occured");
			System.out.println(t.getMessage()); 
			t.printStackTrace();
		}
		System.out.println("Ending");
	}

}
