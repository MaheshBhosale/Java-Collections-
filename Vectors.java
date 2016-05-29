import java.io.*;
import java.util.*;
class car
{
	String name;
	String d;
}
class myException extends Exception
{
	myException()
	{
		super();
	}
}
class Vectors
{
	Vector<car>v=new Vector();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void add()
	{
		System.out.println("Enter Name and Purchase date of the car:");
		String nm="",d="";
		try
		{
			nm=br.readLine();
			d=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Enetr Correct String");
		}
		car c=new car();
		c.name=nm;
		c.d=d;
		v.add(c);
	}
	void remove()
	{
		System.out.println("Enter index of element to be removed:");
		try
		{
			int s=Integer.parseInt(br.readLine());
			s=s-1;
			if(s<0||s>=v.size())
			{
				int start=0,end=0;
				if(v.isEmpty())
				{
					System.out.println("Add something to remove");
				}
				start=1;end=v.size();
				System.out.println("Eneter index in range " +start+" to "+end);
				throw new myException();
			}
		}
		catch(myException e)
		{
			return;
		}
	    catch(Exception e)
	    {
	    	System.out.println("Enter integer index");
	    	return;
	    }
	}
	  car get()
	  {
	  	System.out.println("Enter index of element to get:");
	  	int s=1;
	  	try
		{
			s=Integer.parseInt(br.readLine());
			s=s-1;
			if(s<0||s>=v.size())
			{
				throw new myException();
			}
			
		}
		catch(myException e)
		{
			System.out.println("Eneter index in correct range");
			return null;
		}
	    catch(Exception e)
	    {
	    	System.out.println("Enter integer index");
	    }
	    return v.get(s);
	  }
	    
	  public static void main(String [] args)
	  {
	  	Vectors vi=new Vectors();
	  	vi.menu();
	  }
	  public void menu()
	  {
	  	int opt=1;
	  	while(true)
	  	{
	  		System.out.println("\nEnetr options\n1.Add\n2.Remove\n3.Get\n4.Exit");
	  		try
			{
				opt=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{}
			if(opt>4||opt<=0)
			{
				System.out.println("Invalid Option");
				continue;
			}
			switch(opt)
			{
				case 1:
						add();
						break;
				case 2:
						remove();
						break;
				case 3:
						car c=get();
						System.out.println("Car Details:\nName:"+c.name+"\nDate:"+c.d);
						break;
				case 4:
						return;
			}
		}
	}
}
			
				
