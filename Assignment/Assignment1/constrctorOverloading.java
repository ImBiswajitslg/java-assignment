/*Write a Java Program to define a class, describe its constructor, overload the Constructors and
instantiate its. object.*/
import java.io.*;
import java.util.*;
class constructor
{
 double l,b;
 constructor()
 {
 l=b=0.0;
 }
 constructor(double n)
 {
 l=b=n;
 }
 constructor(double len,double bre)
 {
 l=len;
 b=bre;
 }
 void area()
 {
 double area=l*b;
 System.out.println("Area = "+area);
 }
}
class constrctorOverloading
{
 public static void main(String[] args)
 {
 constructor ob1=new constructor();
 constructor ob2=new constructor(5.0);
 constructor ob3=new constructor(10.0,12.0);
 ob1.area();
 ob2.area();
 ob3.area();
 }
}
