package task_day5;


	class Node {
	    int data;
	    Node next;
	    
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class LinkedList {
	    Node head;
	    
	  
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        
	        if (position == 0) {
	            head = head.next;
	            return;
	        }
	        
	        Node current = head;
	        Node prev = null;
	        int count = 0;
	        
	     
	        while (current != null && count < position) {
	            prev = current;
	            current = current.next;
	            count++;
	        }
	        
	        
	        if (current == null) {
	            System.out.println("Position out of range");
	            return;
	        }
	        
	        
	        prev.next = current.next;
	    }
	    
	    
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	    
	    
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	      
	        list.head = new Node(1);
	        list.head.next = new Node(2);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(4);
	        
	        System.out.println("Original list:");
	        list.printList();
	        
	        list.deleteAtPosition(2); 
	        
	        System.out.println("After deletion:");
	        list.printList();
	    }
	}
	
