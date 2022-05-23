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
	 * 50 21 02 2749 - male, 2 January 1850 5021022749
	 * 53 31 07 9206 - male, 7 November 1853 5331079206
	 * 93 02 26 9871 - female, 26 February 1993 9302269871
	 * 
	 */

	Scanner scanner = new Scanner(System.in);

	String egn = scanner.nextLine();
	
	if (egn.length() != 10) {
	    throw new IllegalArgumentException("Egn must be 10 symbols");
	} else if (egn.equals(null)) {
	    throw new IllegalArgumentException("Egn cannot be null");
	} else {

	    char[] egnArray = egn.toCharArray();
	    
	    
	    System.out.println("You were born on"  + " " + getDate(egn) + " " +getMonth(egn) + " " +  getYear(egn, egnArray)) ;
	    
	    
	}  
	


    } // **
    
    
    private static String getDate(String egn) {
  	String date = egn.substring(4,6);
  	int dateInt = Integer.parseInt(date);
  	if(dateInt<1  || dateInt>31) {
  	throw new IllegalArgumentException("Date must be between 1 and 31");
  	} else {
  	return date;
  	}
      }


    private static String getMonth(String egn) {
	String monthPart = egn.substring(2,4); //2 and 3 index
	String monthCheck = egn.substring(2,3); //2 index
	String month2 = egn.substring(3,4); //3 index
	String monthString =""; //month in words
	//System.out.println(monthPart);
	//January, February, March, April, May, June, July, August, 
	//September, October, November, and December
	
	if(monthCheck.equals("2") || monthCheck.equals("4") || monthCheck.equals("0")) {
	switch (month2) {
	case "1":   { 
	    monthString = "January";
	    break;
	}
	case "2":   { 
	    monthString = "February";
	    break;
	}
	case "3":   { 
	    monthString = "March";
	    break;
	}
	case "4":   { 
	    monthString = "April";
	    break;
	}
	case "5":   { 
	    monthString = "May";
	    break;
	}
	case "6":   { 
	    monthString = "June";
	    break;
	}
	case "7":   { 
	    monthString = "July";
	    break;
	}
	case "8":   { 
	    monthString = "August";
	    break;
	}
	case "9":   { 
	    monthString = "September";
	    break;
	}
	
	}
	} else if (monthCheck.equals("3") || monthCheck.equals("5")) {
	switch (month2) {
	case "0": 
	    monthString = "October";
	    break;
	case "1": 
	    monthString = "November";
	    break;
	case "2": 
	    monthString = "December";
	    break;
	}

	} else throw new IllegalArgumentException();
	return monthString;
	}
    

    private static int getYear(String egn, char[] egnArray) {
	String yearPart = egn.substring(0,2);
	String yearCheck = egn.substring(2,3);
	//System.out.println(yearCheck);
	int year;
	if (yearCheck.equals("4") || yearCheck.equals("5")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 2000;
	return year;
	//System.out.println(year);
	} else if (yearCheck.equals("2") || yearCheck.equals("3")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1800;
	return year;
	//System.out.println(year);
	} else {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1900;
	return year;
	//System.out.println(year);
	

    }
}
}
