package codefromweb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopingInArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("number 1");
		list.add("number 2");
		list.add("number 3");
		list.add("number 4");
		list.add("number 5");
		list.add("number 6");
		// for loop
		System.out.println("#1 normal for loop");
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//enhance/advance for loop
		System.out.println("#2 enhance/advance for loop");
		for(String num: list){
			System.out.println(num);
		}
		//while loop
		System.out.println("# 3 while loop");
		int j = 0; 
		while(list.size()>j){
			System.out.println(list.get(j));
			j++;
		}
		//iterator 
		System.out.println("# 4 iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}



	}

}
