

//6. WAP to check whether an array is a subset of another array.

import java.util.Arrays;import java.util.Arrays;

public class Question6 {
	public static boolean isSubset(int arr1[], int arr2[], int m, int n) {
		 int i = 0;
		 
	        for (i = 0; i < n; i++) {
	            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
	                return false;
	        }
	 
	        return true;
	}
	public static int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/ 2;
 
            if ((mid == 0 || x > arr[mid - 1])&& (arr[mid] == x))
                return mid;
            else if (x > arr[mid])
                return binarySearch(arr,(mid + 1), high,x);
            else
                return binarySearch(arr, low,(mid - 1), x);
        }
        return -1;
    }

	public static void main(String[] args) {
		  int arr1[] = { 11, 10, 13, 21, 30, 70 };
	        int arr2[] = { 11, 30, 70, 10 };
	    
	        int m = arr1.length;
	        int n = arr2.length;
	        
	        Arrays.sort(arr1);
	 
	        if (isSubset(arr1, arr2, m, n))
	            System.out.print("arr2[] is subset of arr1[] ");
	        else
	            System.out.print("arr2[] is not subset of arr1[] ");
	 
	    }

	}

//output: arr2[] is subset of arr1[] 
