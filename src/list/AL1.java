package list;
import java.util.*;
import java.util.List;
public class AL1 {
AL1()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AL1 cc=new AL1();
List<String> a=new ArrayList();
ArrayList<Integer> a3=new ArrayList<Integer>();
for(int i=0;i<=5;i++)
{
	a3.add(i);
}
a.add("hi");
a.add(cc);
a.add("bye");
a.add("good night");
System.out.println(a);
Iterator<Integer> e=a3.iterator();
a.add(0, "rzzzzz");
System.out.println(a);
a.remove("bye");
a.remove(1);
ArrayList ad=new ArrayList();
ad.add("hi");
ad.add(2);
for(String sum:a)
{
System.out.println(sum);

}


LinkedList f=new LinkedList();
f.add((20000));
ArrayList h=new ArrayList(f);
h.add("jk");
h.add(20);
h.add(20.8);
for(Object j:h)
{
	System.out.println(j);
}
}
}
