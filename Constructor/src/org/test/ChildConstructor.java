package org.test;



public class ChildConstructor extends ParentConstructor{
	public ChildConstructor() {
		super(200);
		System.out.println("non para default cons");}
		
	
	
	public ChildConstructor(int id) {
	this("siva");	
		System.out.println("One arugement1  child con");
	}
	public ChildConstructor(String name) {	
		this();
		System.out.println("one arugement2 child con:"+name);
	}
	
	
	public ChildConstructor(int i,String name) {
     	System.out.println("two arugement:"+i+"two arugement:"+name);
		
	}
	public static void main(String[] args) {
	    ChildConstructor e = new ChildConstructor(200);
		
		//ChildConstructor e1=new ChildConstructor(12,"priya");
	}
}
