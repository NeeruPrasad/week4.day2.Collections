package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1 learn";
		//spliting words and storing in String Array
		String[] words=text.split(" ");
		Set<String> wordsSet=new LinkedHashSet<String>();
		for(int i=0;i<words.length;i++) {
			wordsSet.add(words[i]);
		}
		System.out.println(wordsSet);
		for (String string : wordsSet) {
			System.out.print(string.replace(',',' '));
			
		}
		
		//My code with ArrayList
		
		/*List<String> wordsList=new ArrayList<String>();
		
		
		//adding words to ArrayList from String Array
		for(int i=0;i<words.length;i++)
		{
			wordsList.add(words[i]);
		}
		
		//removing duplicates from ArrayList
		int count=0;
		for(int i=0;i<wordsList.size();i++)
		{
			int index=count+1;
			String word=wordsList.get(index-1);
			
			while(index<wordsList.size())
			{
				
				String compString=wordsList.get(index);
				if(compString.equals(word))
				{
					//System.out.print(wordsList.get(index));
					wordsList.remove(index);
				}
				index++;
				if(index>wordsList.size())
					break;
				
			}
			count++;
		}
		System.out.println(wordsList);*/
		
		
	}

}
