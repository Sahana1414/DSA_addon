package task_day6;

public class Stack {
	
	        int mystack[]=new int[5];
	        int top=-1;
	        
	        public void push(int num) {
	        	if(top==0)
	        	{
	        		System.out.println("Stack overflow");
	        	}
	        	else
	        	{
	        		mystack[++top]=num;
	        	
	        	}
	        }
	        public void pop()
	        {
	        	if(top<0) 
	        	{
	        		System.out.println("Underflow");
	        		
	        	}
	        	else
	        		System.out.println(mystack[top]+" popped out");
	        	--top;
	        }
	        public void display()
	        {
	        	for(int i=0;i<mystack.length;i++)
	        	{
	        		System.out.println(mystack[i]+"");
	        	}
	        }

	  
		  public static void main(String[] args) {
		        Stack s = new Stack();
		        s.push(2);
		        s.push(9);
		        s.push(6);
		        s.push(1);
		        s.pop();
		        s.pop();
		        s.display();
		  }
		        
	           
	      	  
	        
		  
		  }
		  
	  



