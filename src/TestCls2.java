import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestCls2 {
	public static void main(String[] args) throws IOException {
		File f= new File("2.txt");
		f.createNewFile();
	}
	
	@Test
	public void test1() throws IOException {
		File f= new File("3.txt");
		f.createNewFile();
	}
	
	public void p1(Object o) {System.out.print(o);}
	public void p2(Object o) {System.out.println(o);}
}
