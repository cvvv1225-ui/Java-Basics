import java.util.Scanner;

class Attendance{
	String number;
	String name;
	String phone;

	public Attendance(String number) {
		this.number = number;
		this.name = "";
		this.phone = "";
	}
	
	public Attendance(String number, String name) {
		this.number = number;
		this.name = name;
		this.phone = "";
	}	
	
	public Attendance(String number, String name, String phone) {
		this.number = number;
		this.name = name;
		this.phone = phone;
	}	
}

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("학생 수 입력 : ");
			int snumber = sc.nextInt();
			
			Attendance stu[] = new Attendance[snumber];
			
			int cnt = 0;
			
			sc.nextLine();
			
			for(int i=0; i<stu.length; i++) {
				System.out.print("학생 정보(학번, 이름, 전화번호) : " );
				String str = sc.nextLine();
				String[] input = str.split(" ");
				
				switch(input.length) {
						case 1:
							stu[cnt] = new Attendance(input[0]);
							break;
						case 2:
							stu[cnt] = new Attendance(input[0],input[1]);
							break;
						case 3:
							stu[cnt] = new Attendance(input[0],input[1],input[2]);
							break;
							
				}
				cnt++;
			}
			
			System.out.println("학번\t이름\t전화번호");
			for(int i=0; i<stu.length; i++) {
				System.out.println(stu[i].number+"\t"+stu[i].name+"\t"+stu[i].phone);
		}
	}
}
