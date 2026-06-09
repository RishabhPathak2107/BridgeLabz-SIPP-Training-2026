class discountOnFee {
	public static void main(String[] args) {
		double totalFee = 125000;
		double discountPercentage = 10;
		double payableFee = totalFee - (totalFee * (discountPercentage/100));
		System.out.println("The discount amount is INR " + totalFee + " and final discounted amount is " + payableFee);
	}
}