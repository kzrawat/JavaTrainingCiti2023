package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Start");

		System.out.println("1. ArrayList");

		List<String> nameList = new ArrayList<String>();

		System.out.println(nameList.size());
		System.out.println("Name List ::" + nameList);

		nameList.add("Paritosh");
		nameList.add("Kapil");
		nameList.add("Abhishek ");
		nameList.add("Abhishek ");

		System.out.println(nameList.size());
		System.out.println("Name List ::" + nameList);

		System.out.println("Name at index 2 ::" + nameList.get(2));
		System.out.println("Remove Name at index 2 ::" + nameList.remove(2));

		System.out.println(nameList.size());
		System.out.println("Name List after Removal ::" + nameList);

		System.out.println("--------------------logical break--------");

		System.out.println("1. HashSet");

		Set<Integer> numberSet = new HashSet<Integer>();

		System.out.println("Size of numberSet" + numberSet.size());
		System.out.println("NumberSet ::" + numberSet);

		numberSet.add(1);
		numberSet.add(4);
		numberSet.add(95);
		numberSet.add(61);
		numberSet.add(45);
		numberSet.add(11);

		System.out.println("Size of numberSet :: " + numberSet.size());
		System.out.println("NumberSet ::" + numberSet);

		System.out.println("Numberset access with toString ::" + numberSet.toString());

		numberSet.remove(45);

		System.out.println("Size of numberSet :: " + numberSet.size());
		System.out.println("NumberSet ::" + numberSet);

		System.out.println("--------------------logical break--------");

		System.out.println("1. TreeSet");

		Set<String> NameTreeSet = new TreeSet<String>();

		System.out.println("Size of TreeSet" + NameTreeSet.size());
		System.out.println("TreeSet ::" + NameTreeSet);

		NameTreeSet.add("B");
		NameTreeSet.add("A");
		NameTreeSet.add("C");
		NameTreeSet.add("Z");
		NameTreeSet.add("B");
//		NameTreeSet.add(null); -- not allow as it is sorted - 

		System.out.println("After Adding");

		System.out.println("Size of TreeSet" + NameTreeSet.size());
		System.out.println("TreeSet ::" + NameTreeSet);

		NameTreeSet.remove("Z");

		System.out.println("Size of TreeSet" + NameTreeSet.size());
		System.out.println("TreeSet ::" + NameTreeSet);

		System.out.println("Main end");

	}

}
