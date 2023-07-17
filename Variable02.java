public class Variable02 {
	public static void main(String[] args) {
		//byte a = 128; // 128이면 에러가 발생		
		// System.out.println("a = " + a);
		
		//short b = 32768; // 32768이면 에러가 발생
		//System.out.println("b = " + b);
		
		//int c = 2147483648; // The literal 2147483648 of type int is out of range
		int c = 2147483647;
		System.out.println("c = " + c);
		
		long d = 9223372036854775808L; //The literal 9223372036854775808L of type long is out of range 

		//long d = 9223372036854775807L;
		System.out.println("d = " + d);
	}
}
