package chap00_00;

public class Exam1{

	public static void main(String[] args) {
		
		BookShop ob = new BookShop("Web/Servlet","Dominica",30000); 
		System.out.println();
		System.out.println("책이름: " + ob.getBname());
		System.out.println("저 자: " + ob.getAuthor()); 
		System.out.println("가 격: " + ob.getPrice());
		
		System.out.println("\n<<값 변경 후 출력>>");
		ob.setBname("안드로이드 이렇게 시작하세요.");
		ob.setAuthor("Sue");
		ob.setPrice(50000);
		
		System.out.println();
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저자 : " + ob.getAuthor());
		System.out.println("가격 : " + ob.getPrice());
		}
		
	}

