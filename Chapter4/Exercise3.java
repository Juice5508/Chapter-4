package Chapter4;

public class Exercise3 {

	public static void printAmerican(String day, String month, String date, int year) {
		System.out.println(day + month + date + year);
	}
	public static void printEuropean(String day, String date, String month, int year) {
		System.out.println(day + date + month + year);
	}
	public static void main(String[] args) {
		printAmerican("Thursday, ", "January ", "11, " , 2018);
		printEuropean("Thursday, ", "11 ", "January, ", 2018);
		
	}

}
