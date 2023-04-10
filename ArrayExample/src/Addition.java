
public class Addition {
 public static void main(String[] args) {
	int ar[] = {12,4,5,6,14,21};
	int temp[]= new int[ar.length];
	int j=0;
	for(int i=0; i<ar.length-1; i++ ) {
		if(ar[i]>0) {
			temp[j]=ar[i]+ar[i+1];
			j++;
		}
	}
	temp[j]=ar[ar.length-1];
	for(int k=0; k<ar.length;k++) {
		System.out.print(temp[k]+" ");
	}
}
}
