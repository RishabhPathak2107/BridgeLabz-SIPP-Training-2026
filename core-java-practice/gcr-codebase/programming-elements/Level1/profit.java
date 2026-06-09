class profit{
	public static void main(String[] args) {
		int costPrice = 129;
		int sellingPrice = 191;
		int profit = sellingPrice - costPrice;
		double profitPercentage = ((double)profit/(double)costPrice)*100;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is " + sellingPrice);
		System.out.println("The profit is INR " + profit + " and the Proft Percentage is " + profitPercentage);
	}
}
