import java.io.*;
import java.nio.channels.FileChannel;
class A{
	A(){
	System.out.println("Parent:");
}
   A(int i){
	System.out.println("Parent:"+i);
}
}
class B extends A{
	 B(int i){
	System.out.println("Parent:"+i);
}
		
	 	   public static void main(String[] args){
			   
			  A a=new A(10); 
			    B b=new B(10); 
	
}
}