import java.util.Scanner;
class distanceInYardsAndMiles {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double distanceInFeets = sc.nextDouble();
		double distanceInYards = distanceInFeets / 3.0;
		double distanceInMiles = distanceInYards / 1760;
		System.out.println("Your height in feets is " +  distanceInFeets + " while in yards and miles are " + distanceInYards + " " + distanceInMiles);
		System.out.println(distanceInMiles);
		
	}
}