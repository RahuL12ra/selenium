package list;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] a = new int[3];
	    a = arithmeticOperation(10, 5);
	    System.out.println("Sum = "+a[0]);
	    System.out.println("Sub = "+a[1]);
	   // System.out.println("multiply = "+a[2]);
	    int arr[][] = {{50,60},{70,80},{90,100}};
	    System.out.println(arr);
	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	    System.out.println(arr[0][1]);*/
	    int arr[][][] = { {{1,2},{3,4},{5,6}}, {{7,8},{9,1},{2,3}} };
	    for(int[][] a:arr)
	    {
	    	for(int[] a1:a)
	    	{
	    		for(int c:a1)
	    		{
	    			System.out.print(c);
	    		}
	    	
	    }
	}
	    System.out.println(Arrays.deepToString(arr));
	    System.out.println(arr.length);
	    int c=arr.length;
	    S as=new S();
	   int d=as.w;
	}
	 int[] arithmeticOperation(int a, int b){
	    int add = a+b;
	    int sub = a-b;
	    int multiply = a*b;
	    int ba[]=new int[3];
	    ba[0]=add;
	    ba[1]=sub;
	    return ba;
	}
	    
}
