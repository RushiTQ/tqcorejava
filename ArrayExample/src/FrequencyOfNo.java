
public class FrequencyOfNo {
	
	public static void checkFrequency(int ar[]) {
		int count;
		for(int i=0;i<ar.length;i++) {
			
			count=1;
			if(ar[i]=='\0') {
				continue;
			}else {
				
				count++;
				System.out.println(ar[i]+" :"+count);
			}
			
		}
	}
	
	
	
 public static void main(String[] args) {
  int ar[]= {1,2,4,4,5,7,5,8,2};
  
}
 
 
 
 
 
}
