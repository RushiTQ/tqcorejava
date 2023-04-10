import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	int evenSum=0;
	int oddSum=0;
	Scanner scan = new Scanner(System.in);
	int ar[] = new int[8];
	System.out.println("Enter the Numbers=");
	
	for(int i=0; i<ar.length;i++) {
		ar[i]=scan.nextInt();
		if(ar[i]%2==0) {
			evenSum=evenSum+ar[i];
			
		}else {
		oddSum=oddSum+ar[i];
		}
	}
	System.out.println("Total of even Numbers="+ evenSum);
	System.out.println("Total of odd Numbers="+ oddSum);
}
}
