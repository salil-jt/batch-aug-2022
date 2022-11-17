package strings;

public class SBLengthCapacity {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("");

		// returns the current capacity of the String buffer i.e. 16 + 0
		System.out.println("empty capacity = " + buff.capacity());

		// printing the length of empty StringBuffer
		System.out.println("empty length = " + buff.length());

		buff = new StringBuffer("Java"); // LINE A
//
//		// returns the current capacity of the String buffer i.e. 16 + 4
		System.out.println("Java capacity = " + buff.capacity());
//
//		// printing the length of StringBuffer
		System.out.println("Java length = " + buff.length());
		
		
		
		
		StringBuffer sb = new StringBuffer(6);
		System.out.println("Initial capacity : " + sb.capacity());
		sb.append("Happy Diwali");
		System.out.println("Lenght of sb : " + sb.length());
		System.out.println("StringBuffer capacity : " + sb.capacity());


	}
}
