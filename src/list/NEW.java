package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NEW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("physics");
		a.add("chemistry");
		a.add("maths");
		a.add("biology");
		a.add("optional");
		a.add(10);
		Arraylist z=new Arraylist();
	
		a.add(z);
		ListIterator x=a.listIterator();
		while(x.hasNext())
		{
		Object c = x.next();
			System.out.println(c);
		}
		while(x.hasPrevious())
		{
			Object q = x.previous();
			System.out.println(q);
	}
Iterator t=a.iterator();
Object j;
while(t.hasNext())
{
	j=t.next();
//System.out.println("withou assign"+j);
System.out.println(t.next());
}
}
}
