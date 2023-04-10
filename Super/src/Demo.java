
public class Demo extends Example {
public static void main(String[] args) {
	Demo d1= new Demo();
	d1.test();
}
public void test() {
	System.out.println(super.num1);  // Using super keyword we can access non static members of parents class
	System.out.println(super.num2);  //Using super keyword we can access static members of parents class
}
Demo(){
	super();  // Using super keyword we can call constructor of parent class.
}
}
