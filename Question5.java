//5. WAP to sort an array using Selection Sort Algorithm.
//->one swap per one iteration..
public class Question5 {
	public static void printArray(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int ar[]= {5,6,7,3,4,1};
		
//		selection sort
//		outer loop runs n-1 times
		for(int i=0;i<ar.length-1;i++) {
//			storing smallest element index
			 int smallest=i;
			 for(int j=i+1;j<ar.length;j++) {
				 if(ar[smallest]>ar[j]) {
					 smallest=j;
			   }
			 }
			 int temp=ar[smallest];
			 ar[smallest]=ar[i];
			 ar[i]=temp;
			 
		}
		
		printArray(ar);
	}

}

//output: 1 3 4 5 6 7 
