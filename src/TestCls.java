import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

class Person{
	String name;
	int age;
	boolean isMale;
	public void eat() {
		System.out.println("eat");
	}
}
public class TestCls {
	public static void main(String[] args) {
		out.println("TestCls");
		Scanner s = new Scanner(System.in);
		String str = "";
		while(true) {
			
			str = s.next();
			System.out.println(str);
			if (str.toLowerCase().equals("y")) {
				break;
			}
		}
	}
	
	public static void testString(String str) {
		str = "test1";
	}
	//1
	public static void testpara(int a ) {
		System.out.println(a);
	}
	//2
	public static void testpara(int... ins) {
		System.out.println(Arrays.toString(ins));
	}
	
	public static void testOjb() {
		Person p = new Person();
		p.name = "test";
		p.age = 10;
		p.isMale = false;
		System.out.println("name:" + p.name);
		p.eat();
	}

	public static void testArray() {
		char[] cs = new char[1];
		System.out.println(cs[0]);
		// System.out.println(cs[1]); err ArrayIndexOutOfBounds
		System.out.println(cs.length);
		if (cs[0] == 0) {// \u0000 not '0'
			System.out.println("is zero");
		}
	}

	public static void testType2() {

		double d1 = 1.5;
		int i1 = (int) d1;
		System.out.println(i1);

	}
	
	

	public static void TestType1() {
		short a = 1;
		short b = 2;
//		short c = a+b;err

		byte b1 = 1;
		byte b2 = 2;
//		byte b3 = b1 + b2; err

		char c1 = 'a';
		char c2 = 'b';
//		char c3 = c1 + c2;
	}

	public static String TestJunit(String str) {
		return str;
	}
}
