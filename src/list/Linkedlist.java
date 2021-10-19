package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList a=new LinkedList();
LinkedList l=new LinkedList();
l.add("hu");
//l.add(2,"kkkk");
System.out.println(l.size());

a.add(200);
a.add(500);
a.add("hi");
		a.add("string");
		a.add(true);
		a.add(null);
		//a.add(10,"jjj");
		a.set(1, 52);
		a.get(2);
		System.out.println(a.contains("hi"));
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf(200));
		Iterator it=a.iterator();
		System.out.println(it);
		LinkedList ac= (LinkedList) a.getFirst();
	}

}
