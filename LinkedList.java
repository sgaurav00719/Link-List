package LinkedList;

public class LinkedList<T extends Comparable<T>> {
	
	/* Count for size of the list*/
	private int count;
	
	
	
	
	private Node<T> first;
	public LinkedList(){
		first = null;
	}
	
	
	
	/* Insert first */
	public void insertFirst(T data){
		count++;
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(first);
		first = newNode;
	}
	
	
	
	/* Insert after function */
	public Node<T> insertAfter(T key, T data){
		Node<T> newNode= new Node<T>(data);
		Node<T> currentNode = first;
		try{
			while ( currentNode.getData() != key ){
				if ( currentNode.getNextNode()==null )
					return null;
				else
					currentNode = currentNode.getNextNode();
			}
			newNode.setNextNode(currentNode.getNextNode());
			currentNode.setNextNode(newNode);
		}
		catch( Exception ex){
			System.out.println("List is empty at this point.");
		}
		return newNode;
	}
	
	
	
	
	/* Find Function */
	public Node<T> find( T key ){
		Node<T> currentNode = first;
		while(currentNode.getData() != key){
			if ( currentNode.getNextNode()==null )
				return null;
			else
				currentNode = currentNode.getNextNode();
		}
		System.out.println("Found the element : " + currentNode.getData());
		return currentNode;
	}
	
	
	
	/* Delete First Function*/
	public void deleteFirst(){
		first = first.getNextNode();
		System.out.println("Element was deleted");
	}
	
	
	
	/* Delete Selective element */
	public void deleteSelective(T key){
		Node<T> previousNode = first;
		Node<T> currentNode = first;
		while( currentNode.getData() != key ){
			if ( currentNode.getNextNode() == null )
				System.out.println( "Element was not found");
			else
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
		}
		if ( currentNode == first )
			first = first.getNextNode();
		else
			previousNode.setNextNode(currentNode.getNextNode());
			currentNode = null;		
	}
	
	
	
	/*Reversing the link list*/ 
	public void reverseList( ){
		if (first == null || first.getNextNode() == null){
			System.out.println("LinkedList has been reversed successfully.");
		}
		else{
			Node<T> previousNode=null;
	        Node<T> currentNode=first;
	        Node<T> nextNode=null;
	        while (currentNode != null ){
	        	nextNode=currentNode.getNextNode(); 
	            currentNode.setNextNode(previousNode); 
	        	previousNode = currentNode;
	        	currentNode = nextNode;
	        }
	        first = previousNode;
	        System.out.println("LinkedList has been reversed successfully.");
		}
	}
	

	/*Displaying link list */
	public void traverseLinkedList(){
		
		Node<T> actualNode = this.first;
		
		while( actualNode != null ){
			System.out.print(actualNode+"->");
			actualNode=actualNode.getNextNode();
		}
		System.out.println("");
	}
	
	
	
	
	//O(1)
	public boolean isEmpty(){
		return this.first == null;
	}
	
	
	
	
	// O(1)
	public int size(){
		return this.count;
	}

}
