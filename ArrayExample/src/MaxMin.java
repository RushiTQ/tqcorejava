
public class MaxMin {
public static void main(String[] args) {
	int arr[]= {2,75,8,1,45,69,3};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
	if(arr[i]<min) {
		min=arr[i];
	}
	}
	System.out.println("Maximum="+ max +" "+"Minimum=" +min );
}
}
