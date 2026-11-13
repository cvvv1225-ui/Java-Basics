package chap00_00;

class Max{
	public int max(int num1, int num2) { // 정수 2개를 비교
		
		if(num1 > num2) 
			return num1;
		
		else
			return num2;
		
	}
	public double max(double num1, double num2) { // 실수 2개를 비교
		
		if(num1 > num2)
			return num1;
		
		else
			return num2;
		
	}
}

public class MaxValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Max m = new Max(); //Max 객체 생성
		
		System.out.println("두 정수 중 큰 값은 " + m.max(1, 6)); 
		System.out.println("두 실수 중 큰 값은 " + m.max(6.1, 1.1)); //비교 출력
	}

}
