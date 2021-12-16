package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> intList=new ArrayList<Integer>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			intList.add(arr[i]);
		}
		
		//printing duplicates from ArrayList
		System.out.println("Duplicate Numbers are:");
		int count=0;
		for(int i=0;i<intList.size();i++)
		{
			int index=count+1;
			Integer num=intList.get(index-1);
			
			while(index<intList.size())
			{
				
				Integer compInt=intList.get(index);
				if(compInt.equals(num))
				{
					System.out.println(intList.get(index));
					intList.remove(index);
					
				}
				index++;
				if(index>intList.size())
					break;
				
			}
			count++;
		}
		
		

	}

}
