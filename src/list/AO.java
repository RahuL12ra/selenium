package list;

import java.util.ArrayList;
import java.util.Iterator;

public class AO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <C> s=new ArrayList<C>();
C f=new C(20,"rahul");
C g=new C(40,"hhh");
System.out.println(f.id);
System.out.println(g);
s.add(f);
s.add(g);
C ae=s.get(0);
System.out.println(ae.id);
System.out.println(ae);
System.out.println(s);
Iterator it=s.iterator();
System.out.println(10+10+"jjj"+'k'+10+10);
while(it.hasNext())
{
	C y=(C) it.next();
	System.out.println(y.id+""+y.name);
}
}
	public  String  tostring()
	{
		return "hi";
		
	}
}
