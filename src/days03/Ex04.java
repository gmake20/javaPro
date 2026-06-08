package days03;

public class Ex04 {

	public static void main(String[] args) {
		/*
		A : 65
		a : 97
		0 : 48
		*/
		System.out.printf("\'%c\'(%d)\n", 'A', (int)'A');
		System.out.printf("\'%c\'(%d)\n", 'Z', (int)'Z');
		System.out.printf("\'%c\'(%d)\n", 'a', (int)'a');
		System.out.printf("\'%c\'(%d)\n", 'z', (int)'z');
		System.out.printf("\'%c\'(%d)\n", '0', (int)'0');
		System.out.printf("\'%c\'(%d)\n", '9', (int)'9');
		
		System.out.println('A'-'a');
		System.out.println('a'-'A');
	}

}
