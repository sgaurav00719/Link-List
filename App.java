package LinkedList;

public class App {
	public static void main(String[] args) {
		LinkedList<Integer> theList = new LinkedList<Integer>();
		System.out.println (theList.isEmpty());
		theList.insertFirst(12);
		theList.insertFirst(11);
		theList.insertFirst(10);
		System.out.println(theList.size());
		theList.traverseLinkedList();
		theList.reverseList();
		theList.traverseLinkedList();
		theList.insertAfter(11, 100);
		theList.traverseLinkedList();
		theList.find(100);
		theList.deleteFirst();
		theList.traverseLinkedList();
		theList.insertFirst(99);
		theList.traverseLinkedList();
		theList.deleteSelective(10);
		theList.traverseLinkedList();
	}
}