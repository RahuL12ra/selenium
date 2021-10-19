package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]=new int[a];
//ArrayList a=new ArrayList(Arrays.asList(a));
ArrayList <String> al=new ArrayList<String>();
al.add("Ram");
al.add("Ram");
al.add("Shyam");
al.add("CPS");
al.add("John");
al.add("Steve");
ArrayList <String> al2=new ArrayList<String>();
al2.add("Ram");
al.add("Shyam");
al2.add("Shyam");
al2.add("Shyam");
al2.add("CPS");
al2.add("John");
al2.add("Steve");
al.removeAll(al2);
//al2.retainAll(al);
//al2.addAll(al);
System.out.println(al);



}
}
