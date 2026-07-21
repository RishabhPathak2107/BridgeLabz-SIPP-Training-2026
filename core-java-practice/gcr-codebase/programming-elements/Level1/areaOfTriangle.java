import java.util,Scanner;
class areaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double baseInCM = sc.nextDouble();
		double heightInCM = sc.nextDouble();
		double baseInInch = baseInCM * 2.54;
		double heightInInch = heightInCM * 2.54;
		
		double areaInInches = 0.5 * baseInInch * heightInInch;
		double areaInCM = 0.5 * baseInCM * heightInCM;
		
		System.out.println("The area of triangle in inches is " + areaInInches + " and in cm is + " areaInCM + " whose base and height are " + baseInCM + ", " + heightInCM);
	}
}