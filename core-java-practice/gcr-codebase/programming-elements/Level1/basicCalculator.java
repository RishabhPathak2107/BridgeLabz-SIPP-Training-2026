import java.util.Scanner;
class basicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		double diff = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + diff  + ", " + mul  + ", " + div);

	}
}