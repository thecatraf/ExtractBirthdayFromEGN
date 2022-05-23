import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	/*
	 * Must be 10 symbols, not more, not less null -> throws new
	 * IllegalArgumentException() 
	 * naf -> throws new IllegalArgumentException() 
	 * 566 -> throws new IllegalArgumentException() 
	 * First 6 symbols are for YYMMDD 
	 * Year must be between 1900 and 1999 
	 * Month must be from 01 to 12 
	 * Day must be between 1 and 31 
	 * 00 44 24 6959 - female, 24th April 2000 
	 * 01 51 09 6115 - female, 9 November 2001 
	 * 50 21 02 2749 - male, 2 January 1850 
	 * 53 31 07 9206 - male, 7 November 1853
	 * 93 02 26 9871 - female, 26 February 1993
	 */

	Scanner scanner = new Scanner(System.in);

	String egn = scanner.nextLine();
	
	if (egn.length() != 10) {
	    System.out.println("Egn must be 10 symbols");
	    throw new IllegalArgumentException(egn);
	} else if (egn.equals(null)) {
	    System.out.println("Egn cannot be null");
	    throw new IllegalArgumentException(egn);
	} else {

	    char[] egnArray = egn.toCharArray();
	    
	    
	    getYear(egn, egnArray);
	}

    }



    private static void getYear(String egn, char[] egnArray) {
	String yearPart = egn.substring(0,2);
	String yearCheck = egn.substring(2,3);
	//System.out.println(yearCheck);
	int year;
	if (yearCheck.equals("4") || yearCheck.equals("5")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 2000;
	System.out.println(year);
	} else if (yearCheck.equals("2") || yearCheck.equals("3")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1800;
	//return year;
	System.out.println(year);
	} else {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1900;
	//return year;
	System.out.println(year);
	

    }
}
}
