package task_day5;


	
	import java.util.Scanner;
	public class Menudriven {
	


				    Node last;

			    class Node {
			        int data;
			        Node next;

			        Node(int val) {
			            data = val;
			            next = null;
			        }
			    }

			    public Menudriven() {
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

			    public void insertAtPosition(int val, int pos) {
			        Node newnode = new Node(val);
			        

			        if (last == null)
			        {

			                last = newnode;
			                last.next = last;
			            } 
			        

			        if (pos == 1) {
			            newnode.next = last.next;
			            last.next = newnode;
			            return;
			        }

			        Node temp = last.next;
			        for (int i = 1; i < pos - 1 && temp != last; i++) {
			            temp = temp.next;
			        }
			        
			        newnode.next = temp.next;
			        temp.next = newnode;

			        if (temp == last) {
			            last = newnode; 
			        }
			    }
			    
			    public void deleteAtPosition(int pos) {
			        if (last == null || pos < 1) {
			            System.out.println("List is empty or invalid position.");
			            return;
			        }

			        Node temp = last.next;

			        
			           
			            if (last == last.next) {
			                last = null;
			            } else {
			                last.next = temp.next; 
			            }
			            return;
			    }

			    public void Display() {
			        if (last == null) {
			            System.out.println("List is empty.");
			            return;
			        }

			        Node temp = last.next;
			        do {
			            System.out.print(temp.data + " ");
			            temp = temp.next;
			        } while (temp != last.next);
			        System.out.println();
			    }

			   

			    public static void main(String[] args) {
			    	Menudriven sc = new Menudriven();
			        Scanner cl = new Scanner(System.in);
			        int choice;

			        do {
			            System.out.println("\t\t Circular Linked List Menu ");
			            System.out.println("1. Insert at end");
			            System.out.println("2. Insert at position");
			            System.out.println("3. Delete at position");
			            System.out.println("4. Display");
			            System.out.println("0. Exit");
			            System.out.print("Enter your choice: ");
			            choice = cl.nextInt();

			            switch (choice) {
			                case 1:
			                    System.out.print("Enter value to insert: ");
			                    int val1 = cl.nextInt();
			                    sc.insert(val1);
			                    break;
			                case 2:
			                    System.out.print("Enter value to insert: ");
			                    int val2 = cl.nextInt();
			                    System.out.print("Enter position: ");
			                    int pos1 = cl.nextInt();
			                    sc.insertAtPosition(val2, pos1);
			                    break;
			                case 3:
			                    System.out.print("Enter position to delete: ");
			                    int pos2 = cl.nextInt();
			                    sc.deleteAtPosition(pos2);
			                    break;
			                case 4:
			                    sc.Display();
			                    break;
			                case 0:
			                    System.out.println("Exiting...");
			                    break;
			                default:
			                    System.out.println("Invalid choice. Try again.");
			            }
			        } while (choice != 0);

			    

			





	}

}

