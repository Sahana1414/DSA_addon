package task_day5;



	public class Basic_cll {
		
		    Node last;

		    class Node {
		        int data;
		        Node next;

		        Node(int val) {
		            data = val;
		            next = null;
		        }
		    }

		    public Basic_cll() {
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

		    public void Display() {

		        Node temp = last.next; 
		        do {
		            System.out.print(temp.data + " ");
		            temp = temp.next;
		        } while (temp != last.next);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Basic_cll sc = new Basic_cll();

		        sc.insert(10);
		        sc.insert(20);
		        sc.insert(30);
		        sc.insert(40);

		        sc.Display(); 
		    }
		}





