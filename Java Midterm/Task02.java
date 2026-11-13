class Member{
	String name;
	int age;
	String tel;
	String email;


	public Member(String name, int age, String tel, String email) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	
	public void printMsg() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
		System.out.println("이메일 : " + email);
	}

}

class Student1 extends Member {
	int score;
	
	public Student1(String name, int age, String tel, String email, int score) {
		super(name, age, tel, email);
		this.score = score;
	}
	
	public void printMsg() {
		super.printMsg();
		System.out.println("점수 : " + score);
	}
}

class Teacher extends Member{
	String subject;
	
	public Teacher(String name, int age, String tel, String email, String subject) {
		super(name, age, tel, email);
		this.subject = subject;
	}
	
	public void printMsg() {
		super.printMsg();
		System.out.println("과목 : " + subject);
	}
}

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** 학생 정보 ***");
		Student1 s = new Student1("홍길동",20,"010-111-1111","hong@naver.com",85);
		s.printMsg();
		
		System.out.println();
		
		System.out.println("*** 교사 정보 ***");
		 Teacher t= new Teacher("성춘향",45,"010-222-2222","sung@naver.com","Java");
		t.printMsg();
	}

}
