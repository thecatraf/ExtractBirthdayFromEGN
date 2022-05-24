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
	    
	    
	    System.out.println("You are a "+ getGender(egn) + " and you were born on"  + " " + getDate(egn) + getEndingOfDate(egn) 
	    + " " + getMonth(egn) + " " + getYear(egn, egnArray) + " in " + getCity(egn) + "." );
	    
	    ;
	}  
	


    } // **



    private static String getGender(String egn) {
	String gender ="";
	int genderCheck = Integer.parseInt(egn.substring(8,9));
	if(genderCheck%2==0) {
	gender = "male";
	} else {
	gender = "female";
	}
	return gender;
    }
    


private static String getCity(String egn) {
	long city = Long.parseLong(egn.substring(6,9));
	String cityString ="";
	if(city >= 00 && city<=43) {
	cityString = "Blagoevgrad";
	}else if (city >= 44 && city<=93) {
	cityString = "Burgas";
	}else if (city >= 94 && city<=139) {
		cityString = "Varna";
	}else if (city >= 140 && city<=169) {
		cityString = "Veliko Turnovo";
	}else if (city >= 170 && city<=183) {
		cityString = "Vidin";
	}else if (city >= 184 && city<=217) {
		cityString = "Vraca";
	}else if (city >= 218 && city<=233) {
		cityString = "Gabrovo";
	}else if (city >= 234 && city<=281) {
		cityString = "Kurdzhaly";
	}else if (city >= 282 && city<=301) {
		cityString = "Kyustendil";
	}else if (city >= 302 && city<=319) {
		cityString = "Lovech";
	}else if (city >= 320 && city<=341) {
		cityString = "Montana";
	}else if (city >= 342 && city<=377) {
		cityString = "Pazardzhik";
	}else if (city >= 378 && city<=395) {
		cityString = "Pernik";
	}else if (city >= 396 && city<=435) {
		cityString = "Pleven";
	}else if (city >= 436 && city<=501) {
		cityString = "Razgrad";
	}else if (city >= 528 && city<=555) {
		cityString = "Ruse";
	}else if (city >= 556 && city<=575) {
		cityString = "Silistra";
	}else if (city >= 576 && city<=601) {
		cityString = "Sliven";
	}else if (city >= 602 && city<=623) {
		cityString = "Smolyan";
	}else if (city >= 624 && city<=721) {
		cityString = "Sofia - grad";
	}else if (city >= 722 && city<=751) {
		cityString = "Sofia - oblast";
	}else if (city >= 752 && city<=789) {
		cityString = "Stara Zagora";
	}else if (city >= 790 && city<=821) {
		cityString = "Dobrich";
	}else if (city >= 822 && city<=843) {
		cityString = "Turgovishte";
	}else if (city >= 844 && city<=871) {
		cityString = "Haskovo";
	}else if (city >= 872 && city<=903) {
		cityString = "Shumen";
	}else if (city >= 904 && city<=925) {
		cityString = "Yambol";
	}else if (city >= 926 && city<=999) {
		cityString = "Unknown location";
	}
	return cityString;
}
    
    private static String getEndingOfDate(String egn) {
   	String endingOfDate = "";
   	int day = Integer.parseInt(getDate(egn));
   	if(day==1 || day==21 || day==31 ) {
   	endingOfDate = "st";
   	} else if (day == 2 || day == 22) {
   	endingOfDate = "nd";
   	} else if (day == 3 || day == 23) {
   	endingOfDate = "rd";
   	} else {
   	endingOfDate = "th";
   	}
   	return endingOfDate;
       }
    
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
	
	//January, February, March, April, May, June, July, August, 
	//September, October, November, December
	
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
	int year;
	
	if (yearCheck.equals("4") || yearCheck.equals("5")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 2000;
	return year;
	} else if (yearCheck.equals("2") || yearCheck.equals("3")) {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1800;
	return year;
	} else {
	year = 10 * Integer.parseInt(egnArray[0] + "") + Integer.parseInt(egnArray[1] + "") + 1900;
	return year;
	

    }
}
}
