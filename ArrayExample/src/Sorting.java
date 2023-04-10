
public class Sorting {
public static void main(String[] args) {
	int arr[]= {2,55,8,47,65,3,8};
	
	secondHighest(arr);
	
}
	
	public static void secondHighest(int ar[]) {
		int temp;
	for(int i=0; i<ar.length-1;i++) {
	for(int j=0; j<ar.length-1; j++) {
		if(ar[j]>ar[j+1]) {
			temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			
		}
	}
	}
	for(int k= 0; k<ar.length;k++) {
		//System.out.println(arr[k]);
		System.out.print(ar[ar.length-2]);
		break;
	}
	//System.out.println(arr.length-1);
}
}
