public class RecPowFcn {
	public static void main(String[] args) {
	System.out.println("power: " + POWER(3,3));
	}
	
	public static int POWER(int x, int k) {

		if(k == 1) { 
		//	x = x; don't understand why it works for sure tho 
		} 
		else { 
			x *= POWER(x,k-1);
		}

		return x;

	}

}
