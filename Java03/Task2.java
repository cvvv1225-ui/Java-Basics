package chap00_00;
import java.util.Scanner;

//1.클래스 설계
class MyCalc{
	//속성(멤버변수)
	int add;
	int sub;
	int mul;
	int div;
	//기능(메소드)
	int addition(int x, int y) { //덧셈
		return (x+y);
	}
	int subtraction(int x, int y) { //뺄셈
		return (x-y);
	}
	int multiplication(int x, int y) { //곱셈
		return (x*y);
	}
    double division(int x, int y) {	 //나눗셈
	    return (double) x / y;
	}
}
// 실행하는 클래스
public class Task2{ 

	public static void main(String[] args) {
		// 
		
		//2.객체 생성
		 MyCalc cal = new MyCalc();
		 Scanner a = new Scanner(System.in); //객체 생성
		 
		//3.객체.메소드() --> 메시지 전달
		int r = cal.addition(1, 3); //addition()을 실행, 결과를 r에 저장
		
		System.out.println(r); //저장한 결과 출력
		System.out.println(cal.subtraction(2, 8)); //뺄셈 결과
		System.out.println(cal.multiplication(4, 5)); //곱셉 결과
 		System.out.println(cal.division(16, 6)); //나눗셈 결과(소수점까지)
	}
}