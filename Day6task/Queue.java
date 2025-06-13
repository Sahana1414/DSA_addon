package task_day6;

import java.util.Arrays;

public class  Queue {
	int arr[]=new int[5];
	int rear;
	int front;
	public Queue()
	{
	      rear=-1;
	      front=-1;
	}
	public void enqueue(int num) {
		if(rear==4)
		{
			System.out.println("Queue spreadout");
			
			}
		else
		{
			arr[++rear]=num;
		}
	}
		
     public void dequque() {
    	 if(front==4)
    	 {
    		 System.out.println("Empty queue");
    	}
    	 else
    	 {
    		 arr[++front]=0;
    	 }
		
	}
     public void display()
     {
    	 System.out.println(Arrays.toString(arr));
     }
     
     public static void main(String[] args) {
    	 Queue q = new Queue();
    	 q.enqueue(2);
    	 q.enqueue(4);
    	 q.enqueue(6);
    	 q.enqueue(8);
    	 q.enqueue(5);
    	 q.enqueue(3);
    	 q.display();
     }
	
	      
		
	}


