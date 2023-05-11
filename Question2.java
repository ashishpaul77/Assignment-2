//2. WAP to sort an array using Quick Sort Algorithm.

//-> Let array be 4,6,5,9,3,8
//variables
//->l- Low -> starting index
//->h- high-> ending index
//->i - make place for elements which are less than pivot
//->pindx - Pivot index

public class Question2 {
	public static int partition(int ar[], int low, int high) {
		int pivot=ar[high];
		int i=low-1;
		
		for( int j=low;j<high;j++){
			if(ar[j]<pivot) {
				i++;
				
				//swap
				int temp=ar[i];
				ar[i] =ar[j];
				ar[j]=temp;
			}
		}
		
		i++;
		int temp =ar[i];
		ar[i]=pivot;
		ar[high]=temp;
		return i; //pivot index
	}
	
  public static void quickSort(int ar[], int low, int high){
	  if(low < high) {
        int pi=partition(ar,low, high);
        
//      call  for smaller elements
        quickSort(ar, low, pi-1);
        
//        call  for smaller elements
        quickSort(ar, pi+1, high);
        
        
        
	  
	  }
		
  }

  public static void main(String[] args) {
		
		int[] ar= {4,6,5,9,3,8};
		int n=ar.length;
		
		quickSort(ar, 0, n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]+" ");
		}
		System.out.println();
		
	
 }
}
