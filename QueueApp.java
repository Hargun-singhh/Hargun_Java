package harguns10;

public class QueueApp {

	public static void main(String[] args) {
		Patient patient1 =new Patient("1.Hargun",18,'M');
		Patient patient2 =new Patient("2.Vansh",17,'M');
		Patient patient3 =new Patient("3.Simar",18,'F');
		Patient patient4 =new Patient("4.Aarushi",18,'F');
		
		Queue queue = new Queue();
		queue.enqueue(patient1);
		queue.enqueue(patient2);
		queue.enqueue(patient3);
		queue.enqueue(patient4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(patient1);
		queue.enqueue(patient3);
		
		queue.iterate();

	}

}
