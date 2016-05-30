import java.io.*;
import java.util.*;
class Dog implements Comparable<Dog>
{
	String name;
	Dog(String nm)
	{
		name=nm;
	}
	public int compareTo(Dog d)
	{
		return this.name.compareTo(d.name);
	}
}
class MyException extends Exception
{
	MyException()
	{
		super();
	}
}
class Reverse implements Comparator<Dog>
{
	public int compare(Dog d1,Dog d2)
	{
		return d2.name.compareTo(d1.name);
	}
}	
class Linkedlists
{
	LinkedList<Dog> a =new LinkedList();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Dog input()
	{
		System.out.println("Enter dog's name");
		String name="";
		try
		{
			name=br.readLine();
		}
		catch(Exception e)
		{}
		Dog d=new Dog(name);
		return d;
	}
	void add()
	{
		Dog d=input();
		a.add(d);
	}
	void addAtPos(int n)
	{
		Dog d=input();
		n=n-1;
		try
		{
			if(n<0||n>=a.size())
			{
				throw new MyException();
			}
			a.add(n,d);
		}
		catch(MyException e)
		{
			System.out.println("Incorrect index Not in range");
			return;
		}
	}
	void display(Dog d)
	{
		System.out.println("Name of the dog is:"+d.name);
	}
	void displayAll()
	{
		for(Object o:a)
		{
			display((Dog)o);
		}
	}
	void remove(int n)
	{
		n=n-1;
		try
		{
			if(n<0||n>=a.size())
			{
				throw new MyException();
			}
			a.remove(n);
		}
		catch(MyException e)
		{
			System.out.println("Incorrect index Not in range");
			return;
		}
	}
	void getDetailsAt(int n)
	{
		n=n-1;
		try
		{
			if(n<0||n>=a.size())
			{
				throw new MyException();
			}
			Dog d=(Dog)a.get(n);
			display(d);
		}
		catch(MyException e)
		{
			System.out.println("Incorrect index Not in range");
			return;
		}
	}
	void Search()
	{
		System.out.println("Enetr dog to be searched:");
		String str="";
		sortR();
		try
		{
			str=br.readLine();
		}
		catch(Exception e){}
		int flg=0;
		for(Object o:a)
		{
			Dog d=((Dog)o);
			if(d.name.equals(str))
			{
				System.out.println("Exists");
				flg=1;
				break;	
			}
		}
		if(flg==0)
		{
				System.out.println("Doesnt exist");
		}
	}
		
	void sortA()
	{
		Collections.sort(a);
	}
	void sortR()
	{
		Reverse r=new Reverse();
		Collections.sort(a,r);
	}
	public static void main(String [] args)
	{
		Linkedlists l=new Linkedlists();
		l.menu();
	}
	public void menu()
	{
		
		int opt=1,i=0;
		while(true)
		{
			System.out.println("Enter options:\n1.Add\n2.Add at position\n3.Remove\n4.Get size\n5.getDetails at position\n6.Sort alphabatically\n7.Sort reverse\n8.Display All\n9.Search\n10.Exit");
			try
			{
				opt=Integer.parseInt(br.readLine());
				if(opt<0||opt>10)
				System.out.println("Enter correct option");
			}
			catch(Exception e){}
			switch(opt)
			{
				case 1:
					add();
					break;
				case 2:
					System.out.println("Enter position at which it is to be inserted");
					try
					{
						i=Integer.parseInt(br.readLine());
					}
					catch(Exception e)
					{
						System.out.println("Enter integer index");
					}
					addAtPos(i);
					break;
				case 3:
					System.out.println("Enter position at which it is to be removed");
					try
					{
						i=Integer.parseInt(br.readLine());
					}
					catch(Exception e)
					{
						System.out.println("Enter integer index");
					}
					remove(i);
					break;
				case 4:
					System.out.println("Size of linked list is:"+a.size());
					break;
				case 5:
					System.out.println("Enter position to get details");
					try
					{
						i=Integer.parseInt(br.readLine());
					}
					catch(Exception e)
					{
						System.out.println("Enter integer index");
					}
					getDetailsAt(i);
					break;
				case 6:
					sortA();
					break;
				case 7:
					sortR();
					break;
				case 8:
					displayAll();
					break;
				case 9:
					Search();
					break;
				case 10:
					return ;
			}
		}
	}
}
					
