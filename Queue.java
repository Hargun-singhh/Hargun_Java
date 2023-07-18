package harguns10;
// FIFO 
public class Queue {
	private static Object remove;
	Patient head;
	Patient tail;
	int size;
	
	Queue(){
		head =null;
		tail=null;
		size =0;
		
	}
	void enqueue(Patient patient) {
		
		 size++;
		 
		if(head ==null) {
			head = patient;
			tail =patient;
			
		}else {
			patient.previous=tail;
			tail.next =patient;
			tail =patient;
			patient.next = null;
			patient.previous = null;
			

		
			
		}
	}
	
	void dequeue() {
		if(size != 0){
			size--;
			head= head.next;

			
			
			
		}else {
			System.err.println("Empty stack");
			
		}
		
		
		}
	
	
	void iterate() {
		
		if(head!=null) {
			Patient temp = head;
		while(true) {
			temp.show();
			temp = temp.next;
			
			if(temp == null) {
				break;
				
			}
		}
		}else {
			System.err.println("QUEUE IS EMPTY ");
		}
		
		
	}

}
