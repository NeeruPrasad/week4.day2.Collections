package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementArrayList {

	public static void main(String[] args) {
		int[] numbers= {3,6,4,12,1,5,9,11};
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:numbers)
		{
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Missing elements are:"+"\n");
		int n=list.get(list.size()-1);
		for(int i=1;i<n;i++)
		{
			
				if(!list.contains(i))
					System.out.println(i);
			
		}
		//System.out.println(list);
	}

}
