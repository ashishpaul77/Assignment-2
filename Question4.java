//4. WAP to sort an array using Merge Sort Algorithm.
//using divide and conquer sorting will done.
//->Let array be 5,6,7,3,4,1
//->si -> starting index
//->ei -> ending index


public class Question4 {
	
	public static void conquer(int ar[], int si, int mid, int ei) {
		
//		new array for storing merged arrays
		int merged[]=new int[ei-si+1];
		
//		index of array-1
		int idx1=si;
		
//		index of array-2
		int idx2=mid+1;
		
//		index of merged array
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			if(ar[idx1]<=ar[idx2]) {
				merged[x++] = ar[idx1++];
				
			}
			else {
				merged[x++]=ar[idx2++];
			}
		}
		
		while(idx1<=mid) {
			merged[x++]=ar[idx1++];
		}
		
		while(idx2<=ei) {
			merged[x++]=ar[idx2++];
		}
		
		
//		copying elements in original array
		for(int i=0,j=si;i<merged.length;i++,j++) {
			ar[j]=merged[i];
		}
	}

	public static void divide(int ar[], int si, int ei) {
		
//		for single elements
		if(si>=ei) {
			return;
		}
		
		int mid=si+(ei-si)/2;
		
		//diving array
		divide(ar, si,mid);
		divide(ar,mid+1,ei);
		conquer(ar, si,mid,ei);
		
		
		
		
		
	}
	public static void main(String[] args) {
		int ar[]= {5,6,7,3,4,1};
		int n=ar.length;
		
 
		divide(ar, 0, n-1);
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	
		System.out.println();
	}

}

//output: 1 3 4 5 6 7 
