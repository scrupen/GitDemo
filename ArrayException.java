
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= new int [4];
		try{
		i[3]=78;
		i[2]=89;
		i[4]=90;
		}
		
		catch(Throwable t){
			System.out.println("Error Occured");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		System.out.println(i[3]);	 
		System.out.println(i[2]);	
			}
	

}
