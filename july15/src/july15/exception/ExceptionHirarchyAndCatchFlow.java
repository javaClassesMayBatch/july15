package july15.exception;

import java.util.ArrayList;

public class ExceptionHirarchyAndCatchFlow {
	public static void main(String a[]){
		String array[] = new String[10]; //this will work fine
		ArrayList<String> al = new ArrayList<String>();
		try{
			//System.out.println(10/0);
			array[2] = "Shubham"; // this will work fine
			al.add(2,"Shubham");
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch (RuntimeException re) {
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Terminating program");
		}
		for(String str: array)
			System.out.println(str);
	}
}
