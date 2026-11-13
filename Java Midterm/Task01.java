class Student{
	String name;
	int rollna;
	int age;
}

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		
		st.name = "추현우";
		st.rollna = 2026001;
		st.age = 23;
		
		System.out.println(st.name + ", " + st.rollna + ", " + st.age);
	}
}
