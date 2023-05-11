//1. WAP to find the duplicates present in an array.

public class Question1 {

	public static void main(String[] args) {

//  Intializing Array
	int ar[]=new int[] {4,6,7,4,7,4,9};
	System.out.println("Duplicate elements in given array");
	
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
			System.out.println(ar[j]);
		  }
		}
	}
	
	
	
 }
}

