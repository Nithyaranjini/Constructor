package org.test;

public class ParentConstructor {
	public ParentConstructor () {
		System.out.println("parent cons");
		
	}
public ParentConstructor(int id) {
	this();
	System.out.println("int Parent Para Constructor:"+id);
	
}
}
