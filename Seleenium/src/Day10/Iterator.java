package Day10;

import java.util.HashSet;
import java.util.Set;

public class Iterator {

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		s.add("Selenium");
		s.add("UFT");
		s.add("coded Ui");
		s.add("Loadrunner");
		
		java.util.Iterator<String> it=s.iterator();
		while (it.hasNext()) 
		{
			String temp=it.next();
			System.out.println(temp);
		}

	}

}
