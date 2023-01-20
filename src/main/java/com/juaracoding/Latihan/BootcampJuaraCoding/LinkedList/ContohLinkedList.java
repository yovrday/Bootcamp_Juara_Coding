package com.juaracoding.Latihan.BootcampJuaraCoding.LinkedList;
import java.util.LinkedList;

public class ContohLinkedList {
	public static void main(String[] args) {
	LinkedList<String> linkedlist = new LinkedList<>();
	
	linkedlist.add("Data 1");
	linkedlist.add("Data 2");
	linkedlist.add("Data 3");
	
	System.out.println("Ukuran LL : " +linkedlist);
	
	String data1 = linkedlist.get(0);
	System.out.println(data1);
	
	linkedlist.addFirst("Data 0");
	linkedlist.addLast("Data 4");
	System.out.println(linkedlist);
	
	int center = linkedlist.size()/2;
	//linkedlist.set(center, "Data Center");
	linkedlist.add(center, "Data Center");
	System.out.println(linkedlist);
	
	linkedlist.removeFirst();
	linkedlist.removeLast();
	linkedlist.remove(1);
	linkedlist.remove("Data 3");
	System.out.println(linkedlist);
	
	
	
	
	}
}
