
public class A {

A(int a, int b){
	this(400);
	System.out.println(a);
	System.out.println(b);
}
A(int a, int b, int c){
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
A(){
	System.out.println(100);
}
A(int a){
	System.out.println(a);
}

public static void main(String[] args) {
	A a3= new A(400,500,600);
	A a2 = new A(200,300);	
	A a1 = new A();
	
}
}
