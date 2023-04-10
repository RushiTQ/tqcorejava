

public class SumArray {
   public static void main(String[] args) {
	   int total=0;
	   int total1=0;
	   int arr[]= {22,75,862,468,123};
	   
	   int sum= 0;
	   for(int i=0; i<arr.length; i++) {
		  sum=sum+arr[i]; 
	   }
	   System.out.println("Sum of no. is: " + sum);
	   
	   while(sum>0) {
		int rem= sum%10;
		  total= total+rem ;
		  sum = sum/10;
	   }
	   System.out.println("The total of sum digits: " +total);
	   while(total>0) {
		  int rem1=total%10;
		  total1= total1+rem1;
		 total= total/10;
	   }
	   System.out.println("The sum of total digits: " +total1);
}
}
