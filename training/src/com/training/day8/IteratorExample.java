package com.training.day8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class IteratorExample {

	public static void main(String[] args) {

		LinkedList<String> lst = new LinkedList<>();
		lst.add("test");
		lst.add("Leaft");
		lst.add("Chennai");

		Iterator<String> iterator = lst.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
		}

		iterator = lst.descendingIterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
		
		LinkedHashSet<String> sst = new LinkedHashSet<>();
		sst.add("test");
		sst.add("Leaft");
		sst.add("Chennai");
		
		for (String temp : sst) {
			System.out.println(temp);
		}
		
		LinkedHashMap<String, String > hmap = new LinkedHashMap<>();
		
		hmap.put("1", "chennai");
		hmap.put("2", "kkdi");
		
		Iterator<Entry<String, String>> it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> obj = it.next(); //next() should be called only once in one itreation 
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
			
		}
	}

}
