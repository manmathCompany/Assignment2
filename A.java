package com.mn.model;

public class A {
	
	B b=new B();
	public static class B{
		public C a;
		static C c=new C();
		public static class C{
			public B b=new B();
		}
		public static void main(String[] args) {
			A a = new A();
			a.b.c=c.b.a;
			
		}
	}
}
