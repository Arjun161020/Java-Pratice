public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int result = Sow.add(10,20);
		System.out.println("********* Addition **********"+result);
		double result1 = Sow.sub(10.403,20.675);
		System.out.println("********* Subtraction **********"+result1);
		long result3 = Sow.mul(10,20,40);
		System.out.println("********* Multiply **********"+result3);
		double result4 = Sow.div(10.403,20.675);
		System.out.println("********* Divide **********"+result4);

	}
	
}

	 class Sow{
    	public static int add(int a , int b){
    	     return a+b;
    	}
    		//method overloading
    	public static double sub(double a , double b){
    	     return a - b;
    	}
    	//2. overloading with 3 parameters
    	public static long mul(long a , long b, long c){
    	    return a*b*c;
    	}
    	
    	//3.overloading with 4 parameters
    	public static double div(double a , double b) {
    	    return a/b;
    	}
	}
