
public class AscDsc {
public static void main(String[] args) {
	int ar[]= {4,7,2,9,13,4,12,8};
	int temp;
	
	for(int i=0;i<ar.length/2; i++) {
	for(int j=0;j<ar.length; j++) {
		if(ar[i]<ar[i+1]) {
			temp=ar[i];
			ar[i]=ar[i+1];
			ar[i+1]=temp;
		}
	}
	}
	for(int k=0;k<ar.length;k++) {
		System.out.print(ar[k]);
	}
	
	}
}

