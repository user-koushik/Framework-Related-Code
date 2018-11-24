/**
 * 
 */
package com.scjp.folder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ksinha
 *
 */
public class ConcurrentModExcp extends Thread{
	
	static ArrayList arrList = new ArrayList<>();
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println("Child Thread is running and updating List---");
		arrList.add("R");
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		
		new ConcurrentModExcp().start();
		
		Iterator iter = arrList.iterator();
		
		while(iter.hasNext()){
			String str = (String) iter.next();
			System.out.println("Main Thread is iterating list and current object is: " + str);
			Thread.sleep(10000);
		}
		System.out.println(arrList);
	}

}
