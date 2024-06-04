Write a JAVA Program to demonstrate Dynamic method dispatch.
class A {
	void show(){};
}
class B extends A {
	void show() {
		System.out.println("Inside class B");//overriding show() of class A
	}
}
class C extends B {
	void show() {
		System.out.println("Inside class C");//overriding show() of class A and B
	}
}
class DynamicMethodDispatch {
	public static void main(String[] args) {
		A ref;
		B obj1=new B();
		C obj2=new C();
		ref=obj1;
		ref.show();
		ref=obj2;
		ref.show();
	}
}