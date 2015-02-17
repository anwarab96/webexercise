package codefromweb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String sArray[] = new String[] {"Array 1","Array 2", "Array 3","Array 4"};
		//convert array to List
		List<String> list = Arrays.asList(sArray);
		//iterator loop
		System.out.println("# 1 iterator");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		//for loop
		System.out.println("# 2 for loop");
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//for loop advance
		System.out.println("# 3 for advance/enhance loop");
		for(String temp: list){
			System.out.println(temp);
		}
		//while loop
		System.out.println("#4 while loop");
		int j = 0;
		while(j<list.size()){
			System.out.println(list.get(j));
			j++;
		}

	}

}
