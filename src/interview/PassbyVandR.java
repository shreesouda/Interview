package interview;

import java.util.ArrayList;

class Person {
	
	public String name;
	
	static void meth (int a[]) {
		a = new int[a.length];//as you've created a new array, its pass by value, if you worked on the same passed 
							  //array, would've changed the value of the passed array which becomes pass by reference.
		a[0] = 4;
	}
	
	//pass by value.
	public static void func (Integer a) {
		a = a + 1;
	}
	////pass by value.
	public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = i; 
	      i = j; 
	      j = temp; 
	   } 
}

public class PassbyVandR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {2};
		int a = 3, b = 4;
		Integer A = new Integer(a);
		Integer B = new Integer(b);
		//Person.func(A);
		Person.meth(arr);
		System.out.println(arr[0]);
		Person.swap(A, B);
		System.out.println(A + " " + B);
		
		Person p = new Person();
		p.name = "old_name";

		ArrayList<Person> list = new ArrayList<>();
		list.add(p);
		list.get(0).name = "new_name";//pass by reference.
		System.out.println(p.name);
		
		//change(list.get(0));
		change2(list.get(0));
		System.out.println(p.name);
		
	}
	//pass by reference.
	static void change (Person p) {
		p.name = "shreenidhi";
	}
	//pass by value
	static void change2 (Person p) {
		p = new Person();
		p.name = "shreenidhi";
	}
	

}
