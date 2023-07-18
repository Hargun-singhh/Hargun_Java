package harguns10;

public class ScreenInterface {
	String title;
	ScreenInterface next;
	ScreenInterface previous;
	
	
	
	ScreenInterface(){
		next =null;
		previous = null;
		
		
	}


	ScreenInterface(String title) {
		this.title = title;
	}
	
	void show() {
		System.out.println(">>"+title);
	}
	

}
