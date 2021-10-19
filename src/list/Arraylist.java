package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		Arraylist a5=new Arraylist();
		System.out.println(a5);
		a.add("hi");
		a.add("Chemistry");
		a.add("biology");
		a.add(20);
		for(Object s:a)
		{
			int i=0;
			String g=(String) a.get(i);
		}
		ListIterator v=a.listIterator();
		Object q = v.next();
		System.out.println(a);
		v.set("himmmmmmm");
		 System.out.println(a);

		System.out.println("list next method"+q);
		ArrayList<String> i=new ArrayList<String>();
		i.add("engg");
		i.add("medico");
		i.add("science");
		i.add("engg");
		i.add("medico");
		i.add("science");
		i.add("hi");	
		
		ArrayList<String> l = new ArrayList<>();
		
		
		System.out.println(l);
		l.add("hhhhhh");
		l.addAll(1, i);
		System.out.println(l);
		System.out.println(l.subList(2, 3));
l.replaceAll(e-> e.toUpperCase());
System.out.println(l);
		int u=20;
		int u1=205;
		System.out.println(u+","+u1);
		

	}

}
