package test2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import static java.lang.System.*;

import java.lang.annotation.RetentionPolicy;

import static java.lang.Math.*;

public class test20241012 {

	public static void pr(Object o) {out.println(o);}
	public static void main(String[] args) {}
	@Test
	public void test1() {
		String str = "a|b|c";
		int[] is = {12,3};
		pr(is.length);
		pr(str.length());
	}
}