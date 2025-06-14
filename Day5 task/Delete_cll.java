package task_day5;

public class Delete_cll {
	

		  Node last;

		    class Node {
		        int data;
		        Node next;

		        Node(int val) {
		            data = val;
		            next = null;
		        }
		    }

		    public Delete_cll() {
		        last = null;
		    }

		    public void insert(int val) {
		        Node newnode = new Node(val);
		        if (last == null) {
		            last = newnode;
		            last.next = last; 
		        } else {
		            newnode.next = last.next; 
		            last.next = newnode;    
		            last = newnode;    
		        }
		    }
		    public void delete() {
		        if (last == null) {
		            System.out.println("List is empty.");
		            return;
		        }

		        Node head = last.next;
		        
		        if (last == head) {
		            last = null;
		        } else {
		            last.next = head.next; 
		        }

		        System.out.println("Head node deleted.");
		    }


		    public void Display() {

		        Node temp = last.next; 
		        do {
		            System.out.print(temp.data + " ");
		            temp = temp.next;
		        } while (temp != last.next);
		        System.out.println();
		    }
		    public static void main(String[] args) {
		    	Delete_cll sc = new Delete_cll();

		        sc.insert(10);
		        sc.insert(20);
		        sc.insert(30);
		        sc.insert(40);
		        sc.Display();
		        sc.delete();

		        sc.Display(); 
		    }
	}

