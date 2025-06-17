package task_day8;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_search {
	
	
	
	public static void amin(String[] args) {
	int arr[] = {3,4,6,7,8,9};
	System.out.println(Arrays.toString(arr));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int find=sc.nextInt();
	
    boolean flag=true;
    
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==find) 
		{
			System.out.println("Value found:"+arr[i]+ "at index"+i);
			flag=true;
			break;
		}
	}
	if (flag==false)
	{
	System.out.println("Value not found");
    }

	}
}
