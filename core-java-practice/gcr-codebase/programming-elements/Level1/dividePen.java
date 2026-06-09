class dividePen{
	public static void main(String[] args) {
		int totalPen = 14;
		int totalStudents = 3;
		int penPerStudent = 14/3;
		int nonDistributedPen = 14%3;
		System.out.println("The pen per student is " + penPerStudent + " and the remaining pen not distributed is " + nonDistributedPen);
	}
}