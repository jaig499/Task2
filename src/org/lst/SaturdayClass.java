package org.lst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SaturdayClass {
	
	public static void main(String[] args) {
		List<Long> li=new ArrayList<Long>();
		li.add(122l);
		li.add(344l);
		li.add(12l);
		li.add(10l);
		
		List<Long> mi=new ArrayList<Long>();
		mi.add(4l);
		mi.add(5l);
		mi.add(6l);
		mi.add(10l);
		
		//after adding values
		//li.addAll(mi);
		//System.out.println(mi);
		
		li.retainAll(mi);
		System.out.println(li);
		
		//just Printing the values
		//System.out.println(li);
		
		int l = li.size();
		System.out.println(l);
		
		Long long1 = li.get(1);
		System.out.println(long1);
	}

}
