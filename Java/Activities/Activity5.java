package activities;

abstract class Book {
	String title;
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}
	
class MyBook extends Book{
	public void setTitle(String s) {
		title=s;
	}

}


public class Activity5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="My first Novel";
		Book newNovel= new MyBook();
		newNovel.setTitle(title);
		System.out.println("Title of the book is "+newNovel.getTitle());
	}
	
}
		
