package task_day2;

import java.util.Arrays;
import java.util.*;

public class target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

      
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Arrays.sort(arr);  
        int left = 0, right = n - 1;
        boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break;
            } else if (sum < target) left++;
            else right--;
        }

        if (!found) System.out.println("No pair found");

        sc.close();
    }
}

