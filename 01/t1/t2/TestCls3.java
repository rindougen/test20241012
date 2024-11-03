package t1.t2; 

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

class A{
	private int m_int1 = 10;

	public A(int m_int1) {
		this.m_int1 = m_int1;
	}

	public int getM_int1() {
		return m_int1;
	}

	public void setM_int1(int m_int1) {
		this.m_int1 = m_int1;
	}
	
}

public class TestCls3 {
	
	public static void main(String[] args) {
		
	}
	
	@Test
	public void testboolean() {
		
		
	}
	
	@Test
	public void test1() throws IOException {
//		int a = (1,2)-> a + b ;
	}
	public int add(int a ,int b) {
		return a + b;
	}
	
	public static void p1(Object o) {System.out.print(o);}
	public static void p2(Object o) {System.out.println(o);}
//	public static boolean retbool(int p1) {
//		if(p1 == 1) {
//			return new A();
//		}else {
//			return null;
//		}
//	}
}
