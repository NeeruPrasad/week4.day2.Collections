package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionArrayList {

	public static void main(String[] args) {
		Set<Integer>l1=new LinkedHashSet<Integer>();
		l1.add(3);
		l1.add(2);
		l1.add(11);
		l1.add(4);
		l1.add(6);
		l1.add(7);
		
		Set<Integer>l2=new LinkedHashSet<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(8);
		l2.add(4);
		l2.add(6);
		l2.add(7);
		
		l2.retainAll(l1);//gets common elements
		System.out.println(l2);
		l2.removeAll(l1);//gets elements in l2 that are not in l1
		
		/*for(Integer i:l1)
		{
			
			for(Integer j:l2)
			{
				if(i.equals(j))
				{
					System.out.println("Intersection number is"+j);
				}
			}
		}*/
		
		

	}

}
