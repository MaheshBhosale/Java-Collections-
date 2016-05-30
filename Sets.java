import java.io.*;
import java.util.*;
class Sets 
{
	Set<Integer> s;
	BufferedReader br;
	Sets()
	{
		s=new HashSet();
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	int input()
	{
		System.out.println("Enetr integer to be added");
		int s=0;
		try
		{
			s=Integer.parseInt(br.readLine());
			
		}
		catch(Exception e)
		{
			System.out.println("Enter valid integer element");
		}
		return s;
	}
	void search(int t)
	{
		int flg=0;
		for(Object o : s)
		{
			if((int)o==t)
			{
				System.out.println("Exits");
				flg=1;
				break;
			}
		}
		if(flg==0)
		{
			System.out.println("Doesnt exist");
		}		
	}
	void add()
	{
		s.add(new Integer(input()));
	}
	void remove()
	{
		System.out.println("Enter integer to be removed");
		int s=0;
		try
		{
			s=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{}
		this.s.remove(new Integer(s));	
	}
	void display()
	{
		System.out.println("Contents of Set are:");
			for(Object o : s)
			{
					System.out.println(""+(Integer)o);
			}
	}		
	public static void main(String [] args)
	{
		Sets a=new Sets();
		a.menu();
	}
	public void menu()
	{
		int opt=1;
		while(true)
		{
			System.out.println("Options\n1.Add Element\n2.remove\n3.display\n4.Search\n5.Sort Reverse\n6.Exit\nEnter Option:");
			try
			{
				opt=Integer.parseInt(br.readLine());
				if(opt<1||opt>5)
				{
					System.out.println("Enter Correct Option");
				}
			}
			catch(Exception e)
			{
				System.out.println("Enter correct integer option");
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
						display();
						break;
				case 4:
						int e=0;
						try
						{
							System.out.println("Enter number to be searched");
							e=Integer.parseInt(br.readLine());
							search(e);
						}
						catch(Exception i){}
						break;
				case 5:
						ArrayList l=new ArrayList(s);
						Collections.sort(l,Collections.reverseOrder());
						System.out.println(""+l);
						s.addAll(l);
						break;
				case 6:
						return;
			}
		}
	}
}
	
	
				
