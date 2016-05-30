import java.io.*;
import java.util.*;
class Dog
{
	String nm;
	Dog(String h)
	{
		nm=h;
	}
}
class ComparatorInOrder implements Comparator<Dog>
{
	public int compare(Dog d1,Dog d2)
	{
		return d1.nm.compareTo(d2.nm);
	}
}
class ComparatorInReverseOrder implements Comparator<Dog>
{	
	public int compare(Dog d1,Dog d2)
	{
		return d2.nm.compareTo(d1.nm);
	}
}
class comparator
{
	public static void main(String [] arsg)
	{
		ArrayList<Dog> l=new ArrayList<Dog>();
		l.add(new Dog("A"));
		l.add(new Dog("E"));
		l.add(new Dog("B"));
		ComparatorInOrder inorder=new ComparatorInOrder();
		ComparatorInReverseOrder reverseorder=new ComparatorInReverseOrder();
		System.out.println("Before sorting:\n");
		display(l);
		Collections.sort(l,inorder);
		System.out.println("After Sorting in order:\n");
		display(l);
		Collections.sort(l,reverseorder);
		System.out.println("After Sorting in reverse Order:\n");
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

