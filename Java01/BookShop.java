package chap00_00;

public class BookShop {
	
	public String bname;
	
	public String author;
	
	public int price;

	public String getBname() {
		// TODO Auto-generated method stub
		return bname;
	}
	
	public void setBname(String a) {
		// TODO Auto-generated method stub
		bname = a;
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}
	
	public void setAuthor(String b) {
		// TODO Auto-generated method stub
		author = b;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public void setPrice(int c) {
		// TODO Auto-generated method stub
		price = c;
	}
	
	public BookShop(String a, String b, int c) {
		// TODO Auto-generated method stub
		bname = a;
		author = b;
		price = c;
	}
}