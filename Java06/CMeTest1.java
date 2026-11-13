package chap00_00;

class A {
	private static int counter = 0; // private와 int 사이에 static을 넣으니 해결?
	
public static int getCount() {
	return counter; // counter의 빨간줄 확인해보니 
}
	public A() {
		counter++;
	}
}
public class CMeTest1 {
	
public static void main(String[] args) {
	A a1 = new A();
	A a2 = new A();
	A a3 = new A();
	System.out.println(A.getCount());
	} 
}
