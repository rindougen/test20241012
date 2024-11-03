
import static org.junit.Assert.*;

import org.junit.Test;

public class TestClsTest {

	@Test
	public void testTestJunit() {
		
		int[] is = new int[3];
		System.out.println(is);//[I@48e4374
		System.out.println(is.getClass());//class [I
		System.out.println(is.getClass().getSuperclass());//class java.lang.Object
	}

}
