import java.util.Scanner;
class noOfHandshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		int totalNumberOfHandshakes = noOfStudents * (noOfStudents - 1) / 2;
		System.out.println(totalNumberOfHandshakes);
	}
}