package list;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("physics");
		a.add("chemistryt");
		a.add("maths");
		a.add("bio");
		a.add("engg");
        a.add("medico");
		ArrayList<String> i=new ArrayList<String>();
		i.add("engg");
		i.add("medico");
		i.add("science");
		i.add("engg");
		i.add("medico");
		i.add("science");
		i.removeAll(a);
		System.out.println(i);
		System.out.println(i.size());
		i.retainAll(a);
		
		System.out.println(i);
		
	}

}
