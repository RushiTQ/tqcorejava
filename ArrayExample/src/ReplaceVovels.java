
import java.util.Scanner;
public class ReplaceVovels {
	
	public static void replaceVowels(String str) {
		str=str.toLowerCase();
        char ch[]=str.toCharArray();
        for (int i=0; i<ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$';
               }   
        }
        for (int k=0; k<ch.length; k++) {
            System.out.print(ch[k]);
        }
	}
	
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("enter the string");
	        String st=scan.nextLine();
	        
	        replaceVowels(st);
	        
	      
	        }
	    }
	

