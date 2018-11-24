/**
 * 
 */
package com.scjp.folder;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModUsingConHashMap extends Thread{
	
	// If you change the ConcurrentHashMap to only Map then this code will throw "ConcurrentModificationException.."
	static ConcurrentHashMap map = new ConcurrentHashMap<>();
	
	public void run(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		System.out.println("Child Thread iterating Map..");
		map.putIfAbsent(107, 'G');
	}
	
	
	public static void main(String[] args) throws InterruptedException {
	
		map.putIfAbsent(101, 'A');
		map.putIfAbsent(102, 'B');
		map.putIfAbsent(103, 'C');
		map.putIfAbsent(104, 'D');
		map.putIfAbsent(105, 'E');
		map.putIfAbsent(106, 'F');
		
		System.out.println("Just to check the Map values: " + map + "\n");
		
		new ConcurrentModUsingConHashMap().start();
		
		Set setMp = map.keySet();
		
		Iterator iterSet = setMp.iterator();
		
		/*While main thread is iterating the other thread (Child) is allow to perform any modification it wants but the updation is
		is available to the iterator or not? There is no guarantee for that.
		But at last when you print SOP in below, now you can see the latest updation*/
		
		while(iterSet.hasNext()){
			Integer intr = (Integer) iterSet.next(); 
			
			System.out.println("Main thread iterating map and current entry is: " + intr + "=====" + map.get(intr));
			Thread.sleep(1000);
		}
		System.out.println("\n" + map); 
		
	}

}
