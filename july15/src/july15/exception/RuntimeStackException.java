package july15.exception;

public class RuntimeStackException {
	public static void main(String a[]){
		System.out.println("inside main");
		getStuff();
		System.out.println("exiting main");
	}
	
	public static void getStuff(){
		System.out.println("inside get stuff");
		getSomeStuff();
		System.out.println("exiting get stuff");
	}
	
	public static void getSomeStuff(){
		System.out.println("inside get some stuff");
		getSomeMoreStuff();
		System.out.println("exiting get some stuff");
	}
	
	public static void getSomeMoreStuff(){
		System.out.println("inside get some more stuff");
		try{
			
			System.out.println(10/0);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("existing get some more stuff");
	}
}
