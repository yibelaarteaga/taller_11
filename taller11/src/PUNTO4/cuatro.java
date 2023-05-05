package PUNTO4;

public class cuatro {

	public static final int num = 10;

	int getFactorial() {
		int factorial = 0;
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public String toString() {
		String factorialStr = "factorial : " + num + " ! = ";
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
			if (i != num) {
				factorialStr += i + " * ";

			}
		}
		factorialStr += num + " = " + factorial;
		return factorialStr;

	}

	public static void main(String[] args) {
		cuatro f = new cuatro();
		System.out.println(f);
	}

}
