package task_day8;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
		int[] arr= {1,3,5,4,56,23,89,7,9};
		System.out.println("main array"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array"+Arrays.toString(arr));
		System.out.println("Enter the value to find:");
		Scanner sc=new Scanner(System.in);
		int find =sc.nextInt();
		int left=0;
		int right=arr.length-1;
		int mid;
		boolean flag=false;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==find)
			{
				System.out.println("Value found" + arr[mid] + " at index"+mid);
				flag=true;
				break;
				
			}
			else if(find>arr[mid])
			{
				left=mid+1;
				
			}
			else if(find<arr[mid])
			{
				right=mid-1;
			}
				
		}
		if(flag==false) {
		System.out.println("Not found");
		
	}

}
}
