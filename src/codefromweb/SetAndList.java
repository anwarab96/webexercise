package codefromweb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndList {

	public static void main(String[] args) {
		//example of list
		System.out.println("List example........");
		List<String> list = new ArrayList<String>();
		list.add("Exm 1");
		list.add("Exm 2");
		list.add("Exm 3");
		list.add("Exm 4");
		list.add("Exm 5");
		list.add("Exm 2");
		for(String exm: list){
			System.out.println(exm);
		}
		//example of set
		System.out.println("Set example .......");
		Set<String> set = new HashSet<String>();
		set.add("exm 1");
		set.add("exm 2");
		set.add("exm 3");
		set.add("exm 4");
		set.add("exm 5");
		set.add("exm 6");
		set.add("exm 3");
		for(String exm: set){
			System.out.println(exm);
		}
	}

}
