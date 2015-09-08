/*****************************************************
* The power of x^k for k >=1 
* using resursive approach. Thinking resursively
* exercise 3.1.
* Wilson Mateo.  
******************************************************/
public class RecPowFcn {

	public static void main(String[] args) {
	System.out.println("power: " + POWER(3,3));
	}
	
	public static int POWER(int x, int k) {
		// hold the value of x^k 
		int result = 0;
		
		if(k == 1) { 
			result = x;
		} 
		else { 
			// recursive call
			result = x*POWER(x,k-1);
		}

		return result;
	}

}
