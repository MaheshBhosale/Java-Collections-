import java.io.*;
import java.util.*;
class Dog implements Comparable<Dog>
{
	String nm;
	Dog(String h)
	{
		nm=h;
	}
	public int compareTo(Dog d)
	{
		return this.nm.compareTo(d.nm);
	}
}
class comparable
{
	public static void main(String [] arsg)
	{
		ArrayList<Dog> l=new ArrayList<Dog>();
		l.add(new Dog("A"));
		l.add(new Dog("E"));
		l.add(new Dog("B"));
		System.out.println("Before sorting:\n");
		display(l);
		Collections.sort(l);
		System.out.println("After Sorting:\n");
		display(l);
	}
	static void display(ArrayList l)
	{	
		for(Object o :l)
		{
			System.out.println(""+((Dog)o).nm+"\n");
		}
	}
}

