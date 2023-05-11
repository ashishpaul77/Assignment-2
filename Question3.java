//3. WAP to sort an array using Bubble Sort Algorithm.
//->Pushing big elements and keeping them last.
//->Adjacent elements are compared and sorted.
//->running n-1 loop

//let array be 5,6,7,3,4,1

public class Question3 {
	
//	printing array
	public static void printArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	
		int ar[]= {5,6,7,3,4,1};
		
		//bubble sort
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					
					//swap
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
			
		
		}
		
		
		
		printArray(ar);

	}
}

//output: 1 2 3 7 8 