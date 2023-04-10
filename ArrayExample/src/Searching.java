import java.util.Scanner;

public class Searching {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int ar[] = new int[8];
	System.out.println("Enter any numbers");
	for(int i=0; i<ar.length;i++) {
		ar[i]=scan.nextInt();
		if(ar[i]==3) {
			System.out.println(ar[i]);
			break;
		}
	}
}
}
