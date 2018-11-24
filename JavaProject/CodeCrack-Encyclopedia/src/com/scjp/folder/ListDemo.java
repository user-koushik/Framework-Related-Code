/**
 * 
 */
package com.scjp.folder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ksinha
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		
		List abcList = new ArrayList<>();
		
		//ArrayList abcList  = new ArrayList<>(); 
		
		abcList.add(1);
		abcList.add(13);
		abcList.add(2);
		abcList.add(21);
		abcList.add(6);
		abcList.add(0);
		abcList.add(34);
		abcList.add(34);
		abcList.add(34);
		abcList.add(4);
		abcList.add(null);
		abcList.add(null);
		abcList.add(null);
		
		System.out.println(abcList + " " + "Size: " + abcList.size());
		
		System.out.println("Get Operation: " + abcList.get(3)); 
		
		abcList.remove(3);
		
		System.out.println(abcList + "\n\n\n");
		
		Iterator iter = abcList.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		

	}

}
