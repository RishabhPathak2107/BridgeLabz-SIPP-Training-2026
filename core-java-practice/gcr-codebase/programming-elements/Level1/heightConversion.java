import java.util.Scanner;
class heightConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double heightInCM = sc.nextDouble();
		double oneFeetToCM = 12 * 2.54;
		double heightInFeet = Math.floor(heightInCM / oneFeetToCM);
		double remainingCM = heightInCM % oneFeetToCM;
        double heightInInches = remainingCM / 2.54;
		System.out.println("Your Height in cm is " + heightInCM + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
	}
}