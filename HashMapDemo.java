import java.util.*;
 
class HashMapDemo extends Thread{
/*public	void run(){
		HashMap  m= hashMap();
		
		m.remove("Chiranjeevi");
		m.remove("Nagarjuna");
System.out.println(m);
		
	}*/
static HashMap	hashMap(){
		
HashMap m=new HashMap();
m.put("Chiranjeevi",100);
m.put("Nagarjuna",200);
m.put("Balaiah",300);
m.put("Venkatesh",400);
m.put("Nagarjuna2",200);
m.put("Balaiah2",300);
m.put("Venkatesh2",400);
System.out.println(m);
Set s2=m.entrySet();


Iterator itr=s2.iterator();

while(itr.hasNext()){
Map.Entry m1=(Map.Entry)itr.next();
System.out.println("key "+m1.getKey()+" "+"value"+m1.getValue());
if(m1.getKey().equals("Nagarjuna")){
m1.setValue(800);
System.out.println("key "+m1.getKey()+" "+"value"+m1.getValue());
}
}
return m;
	}
	
public static void main(String []args) throws Exception{
	HashMapDemo t=new HashMapDemo();
	t.hashMap();

	

}

}


