import java.util.*;
class totalPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double unitPrice = sc.nextDouble();
		double quantity = sc.nextDouble();
		double totalPrice = unitPrice * quantity;
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " ans unit price is " + unitPrice);
	}
}