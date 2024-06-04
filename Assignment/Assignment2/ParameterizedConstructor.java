/*WAP using parameterized constructor with two parameters id and name. While creating the objects
objl and obj2 passed two arguments so that this constructor gets invoked after creation of obj1 and
obj2.*/
import java.io.*;
class pCons {
	pCons(int id,String name) {
		System.out.println("The id is " +id);
		System.out.println("The name is " +name); 
	}
}
class ParameterizedConstructor {
	public static void main(String[] args) {
		pCons obj1=new pCons(123,"Biswajit");
		pCons obj2=new pCons(456,"Suman");
	}
}
