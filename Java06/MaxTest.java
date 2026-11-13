package chap00_00;

public class MaxTest {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int maxvalue = max(a,b);
		
		System.out.println("두 수중 큰 값은(" + a +"," + b + ") : " + maxvalue);
	}
public static int max(int num1, int num2) {
	int result;
	
	if ( num1 > num2 )result = num1;
	else 
		result = num2;
	return result;
	}
}