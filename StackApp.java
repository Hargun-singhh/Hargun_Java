package harguns10;

public class StackApp {

	public static void main(String[] args) {
		ScreenInterface screen1 = new ScreenInterface("Amazon App Home Page");
		ScreenInterface screen2 = new ScreenInterface("Amazon App Product 1");
		ScreenInterface screen3 = new ScreenInterface("Amazon App Product 2");
		
		Stack stack = new Stack();
		stack.push(screen1);
		stack.push(screen2);
		stack.push(screen3);
		stack.pop();
		stack.pop();
		stack.pop();
//		stack.push(screen1);
		stack.iterate();
		
		
		
		
		
		
	

	}
	}
