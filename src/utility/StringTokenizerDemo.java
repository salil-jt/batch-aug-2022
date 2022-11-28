package utility;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("Welcome to Java " + " sessions."); // LINE A
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.print("---------\n");
		StringTokenizer st2 = new StringTokenizer("Good morning,Today is," + "Saturday.", ","); // LINE B
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
//		System.out.print("---------\n");
		StringTokenizer st3 = new StringTokenizer("This-is-a-string-with hyphens.", "-", true); // LINE C
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}
}
