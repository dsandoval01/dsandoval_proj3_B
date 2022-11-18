public class Queue{

	/* Private fields for implementing a queue. */
	private Node head;
	private int size;
	private Node tail;

	//Create an empty queue where size is zero
	public Queue(){
		head = null;
		tail = null;
		size = 0;
	}

	//Method to display current nodes we're holding
	public void display(){
		Node cur = head;
		for(int i = 0; i < size; i++){
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
	}

	public void enqueue(double val){ //Changed ints to doubles for the CapGain class
		Node v = new Node(val,null); //Initialize a new node that holds value
		if (head == null){
			head = v;
			tail = v;
		}
		else{
			tail.next = v;
			tail = tail.next;
		}
		size++;
	}

	public double dequeue(){ //Method for removing whatevers at the front of queue
		double temp = head.value;
		head = head.next; 
		size --; 
		if (size == 0){
			tail = null;
		}
		return temp;
	}

	public double front(){ //Simply returns whats at the front
		return head.value;
	}

	public boolean Empty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public int size(){
		return size;
	}
}

/* Test method to make sure queue properly adds/removes/displays, etc. 
 * while encoding it */
 
class QueueTest{
	public static void main(String[] args){
		Queue a = new Queue();
		a.enqueue(57);
		//System.out.println("check1");
		//a.display();
		a.enqueue(70);
		//a.display();
		a.enqueue(0);
		//System.out.println("check2");
		a.display();
		System.out.println("Original List");
		System.out.println(a.dequeue());
		a.display();
		System.out.println("New List");
		a.front();
		System.out.println("Front");
		a.Empty();
		System.out.println("Empty?");
		a.size();
		System.out.println("size");
	}
}
