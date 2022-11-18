/** 
 * Class definition for a Node of a singly linked list
 */
public class Node {

	public double value;
	public Node next;
	
	/** 
	 * Constructor: creates a node with the given element and next Node. 
	 */
	public Node(double e, Node n) {
		value = e;
		next = n;
	}
}