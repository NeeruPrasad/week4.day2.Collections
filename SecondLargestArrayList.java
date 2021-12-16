package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestArrayList {

	public static void main(String[] args) {
		int[] numbers= {37,42,29,12,24,38};
		List<Integer> list=new ArrayList<Integer>(numbers.length);
		for(Integer i:numbers)
		{
			list.add(i);
		}
		Collections.sort(list);
		System.out.println("Second Largest Number in List is "+list.get(list.size()-2));
		
		
	}

}
