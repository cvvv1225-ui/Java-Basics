package chap00_01;

import java.util.Scanner;

class Member{
	String name;
	int age;
	String number;
	String email;
	
	public Member(String name, int age, String number, String email) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
	}
}

interface Action{
	void execute(Scanner s);
}

class AddAction implements Action{

	@Override
	public void execute(Scanner s) {
		// TODO Auto-generated method stub
		System.out.println("[회원가입]");
		System.out.print("이름 : ");
		String name = s.next();
		System.out.print("나이 : ");
		int age = s.nextInt();
		System.out.print("번호 : ");
		String number = s.next();
		System.out.print("이메일 : ");
		String email = s.next();
		
		//Member 객체생성
		Task01.members[Task01.i] = new Member(name, age, number, email);
		
		System.out.println("회원가입 완료!");
	}
}

class SearchAction implements Action{

	@Override
	public void execute(Scanner s) {
		// TODO Auto-generated method stub
		System.out.println("[회원조회]");
		System.out.print("회원의 이메일 : ");
		String email = s.next();
		
		for(int j = 0; j < Task01.i; j++) {
			if(Task01.members[j].email.equals(email)) {
				System.out.println("이름 : " + Task01.members[j].name);
				System.out.println("나이 : " + Task01.members[j].age);
				System.out.println("전화번호 : " + Task01.members[j].number);
				System.out.println("이메일 : " + Task01.members[j].email);
				
			} else {
				
				System.out.println("해당 회원이 없음");
				
			}
		}
	}
}

class PrintAction implements Action{

	@Override
	public void execute(Scanner s) {
		// TODO Auto-generated method stub
		System.out.println("[목록출력]");
		
		for(int j = 0; j < Task01.i; j++) {
			System.out.println("이름 : " + Task01.members[j].name);
			System.out.println("나이 : " + Task01.members[j].age);
			System.out.println("전화번호 : " + Task01.members[j].number);
			System.out.println("이메일 : " + Task01.members[j].email);
			System.out.println();
		}
	}
}

public class Task01 {

	static Member[] members = new Member[10];
	static int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String command = "";
		
		do {
			System.out.println("다음 메뉴 중 하나를 선택하세요");
			System.out.println("1.회원가입");
			System.out.println("2.회원조회");
			System.out.println("3.목록출력");
			System.out.println("4.종료");
			
			command = sc.next();
			
			switch(command) {
			
			case "1":
				AddAction addaction = new AddAction();
				addaction.execute(sc);
				i++;
				break;
				
			case "2":
				SearchAction searchaction = new SearchAction();
				searchaction.execute(sc);
				break;	
				
			case "3":
				PrintAction printaction = new PrintAction();
				printaction.execute(sc);
				break;
			}
			
		}while(!command.equals("4"));
		System.out.println("시스템을 종료합니다");
		
	}

}
