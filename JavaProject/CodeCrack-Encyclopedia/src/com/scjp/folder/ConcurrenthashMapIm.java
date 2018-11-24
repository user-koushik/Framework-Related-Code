/**
 * 
 */
package com.scjp.folder;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenthashMapIm {
	
	public static void main(String[] args) {
	
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		
		map.put(101, 'A');
		map.put(102, 'B');
		
		// ConcurrentHashMap related methods 
		
		map.putIfAbsent(103, 'C');

		/*This below entry will not enter into the Map as this method will check the Key if it exists then Map will not override
		value like MAP*/ 
		map.putIfAbsent(102, 'D');
		
		map.remove(102, 'D');
		
		map.replace(102, 'B', 'P');
		
		System.out.println("ConcurrentHashMap contains: " + map);
	}

}
