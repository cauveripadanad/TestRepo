package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ArrayListEx {
	
	public void t1(){
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("d");
	al.add("e");
	
	System.out.println("list after adding" +al);	//[a, b, c, d, e]
	
	al.add(0,"aa");
	al.add(1,"bb");
	
	System.out.println("list after changing -- " +al); // [aa, bb, a, b, c, d, e]
	
	al.remove("a");
	al.remove("e");
	
	System.out.println("after removing == "+al); 	//[aa, bb, b, c, d]
	
	
	System.out.println("Size -- " +al.size());
	
	
	}
	
	public void t2(){
		
		ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		
		System.out.println("t2 -- "+arraylist);
	}
	
	
	public void t3(){
		
		ArrayList<String> arraylist1 = new ArrayList<String>(){{
			
			add("aa1");
			add("ab1");
			add("ac1");
		}};	
				
		System.out.println("t3 -- "+arraylist1);
	}

	
	public void t4(){
		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		
		arraylist2.add("aq");
		arraylist2.add("bq");
		arraylist2.add("cq");
		arraylist2.add("dq");
		
		for(int i=0; i<arraylist2.size();i++){
			
			System.out.println(" list t4 -- "+arraylist2.get(i));
		}
		
	}
	
	
	public void t5(){
		
		ArrayList<String> arraylist3 = new ArrayList<String>(Arrays.asList("qa","qs","qd","qf"));
		
		int i=0;
		
		while(i<arraylist3.size()){
			
			System.out.println(" t5 -- "+arraylist3.get(i));
			
			i++;		
		}
	}
	
	
	
	public void t6(){
		
		ArrayList<String> arraylist4 = new ArrayList<String>();
		
		arraylist4.add("a");
		arraylist4.add("b");
		arraylist4.add("c");
		arraylist4.add("d");
			
		Iterator it = arraylist4.iterator();
		
		while(it.hasNext()){
			
			String a = (String) it.next();
			
			System.out.println(a);
			
			
		}
		
	}
	

	public void t7(){
		
		ArrayList<String> arraylist5 = new ArrayList<String>();
		
		arraylist5.add("z");
		arraylist5.add("x");
		arraylist5.add("a");
		arraylist5.add("i");
		arraylist5.add("s");
		
		for(int i=0;i<arraylist5.size();i++){
			
			String ss = arraylist5.get(i);
			System.out.println("before sort -- " +ss);
			
		}
		
		Collections.sort(arraylist5);
		
		Collections.sort(arraylist5,Collections.reverseOrder());
		
		for(int j=0;j<arraylist5.size();j++){
			
			String jj = arraylist5.get(j);
			
			System.out.println("after sorting -- "+jj);
		}
		
	}
	
	
	public void t8(){
		
		ArrayList<String> arraylist6= new ArrayList<String>();
		
		arraylist6.add("aaaa");
		arraylist6.add("bbbb");
		arraylist6.add("cccc");
		arraylist6.add("dddd");
		
		ArrayList<String> arraylist7= new ArrayList<String>();
		
		arraylist7.add("aaaa");
		arraylist7.add("bbbb1");
		arraylist7.add("cccc1");
		arraylist7.add("dddd1");
		
		
		//ArrayList<String> arraylist8= new ArrayList<String>();
		
		for(int i=0;i<arraylist6.size();i++){
			
			boolean aaa = arraylist7.contains(arraylist6.get(i));
			
			System.out.println(aaa);
			
			if(aaa==true){
				
				System.out.println(arraylist6.get(i));
			}
					
		}
		
	}
	
	@Test
	public void t9(){
		
		ArrayList<String> arraylist8 = new ArrayList<String>();
		
		arraylist8.add("a");
		arraylist8.add("d");
		arraylist8.add("b");
		arraylist8.add("c");
		arraylist8.add("f");
		arraylist8.add("e");
		
		System.out.println(arraylist8);
		
		
		Collections.swap(arraylist8, 1, 2);
		
		for(String ex : arraylist8){
			
			System.out.println(ex);
		}
	
	}
		
}
