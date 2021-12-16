package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class OccuranceOfCharactersMap {

	public static void main(String[] args) {
		String str="paypalindia";
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		char[] ch=str.toCharArray();
		/*for (char c : ch) {
			
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}  (or)*/
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i],0)+1);
		}
		
		
		System.out.println(map);
		List<Integer> list=new ArrayList<Integer>(map.values());//to get values of map into list
		 Collections.sort(list);
		 int n=list.get(list.size()-2);
		 System.out.println(n);
		for (Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()==n)
			{
				System.out.println("Key is "+m.getKey()+" and Value is "+m.getValue());
			}
			
		}

	}

}
