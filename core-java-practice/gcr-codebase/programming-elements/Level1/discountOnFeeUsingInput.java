import java.util.Scanner;
class discountOnFeeUsingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalFee = sc.nextDouble();
		double discountPercentage = sc.nextDouble();
		double payableFee = totalFee - (totalFee * (discountPercentage/100));
		System.out.println("The discount amount is INR " + totalFee + " and final discounted amount is " + payableFee);
	}
}