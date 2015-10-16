public class QuickSort {
	public static void main(String[] args) {
		int[] a= new int[10];
		for(int i=0; i<10; i++) {
			a[i]= (int) (Math.random()*100);
		}
		QuickSort t= new QuickSort();
		t.Quick(a, 0, 9);
		for(int i=0; i<10; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	public void Quick(int a[], int low, int high) {
		if(low>= high) {
			return;
		}
		
		int first= low;
		int last = high;
		int key  = a[first];
		while(first< last) {
			while(first< last&& a[last]>= key) {
				last--;
			}
			a[first]= a[last];
			
			while(first< last&& a[first]<= key) {
				first++;
			}
			a[last]= a[first];
		}
		a[first]= key;
		Quick(a, low, first-1);
		Quick(a, first+1, high);
	}
}
