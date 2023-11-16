package operators;

public class SwitchDemo {
	public static void main(String[] args) {
	
		// where you have to provide weekDay Number based on weekdayName
		// Monday = 1; Mon 
		// Tuesday = 2; Tue
		// wed=3 / Wed
		// thu = 4 // Thu
		// friday = 5 // Fri
		// saturday = 6 // Sat
		// Sunday = 7; // Sun

		
		int dayNumber = -1;
		
//		if(dayValue.equals("Monday") || dayValue.equals("Mon")) {
//			dayNumber  = 1;
//		}else if(dayValue.equals("Tuesday")  || dayValue.equals("Fri")) {
//			dayNumber  = 2;
//		}else if(dayValue.equals("Wednesday")  || dayValue.equals("Wed")) {
//			dayNumber  = 3;
//		}else if(dayValue.equals("Thursday") || dayValue.equals("Thu")) {
//			dayNumber  = 4;
//		}else if(dayValue.equals("Friday") || dayValue.equals("Fri")) {
//			dayNumber  = 5;
//		}else if(dayValue.equals("Saturday") || dayValue.equals("Sat")) {
//			dayNumber  = 6;
//		}else if(dayValue.equals("Sunday") || dayValue.equals("Sun")) {
//			dayNumber  = 7;
//		}
		
//		System.out.println(dayNumber);
		
		// switch we can use only for equality check
		String dayValue = "sdasfadf";
		switch(dayValue) {
			case "Monday":
			case "Mon":
			case "Mo":	
				dayNumber = 1;
				break;
			case "Tuesday":
			case "Tue":
			case "Tu":
				dayNumber = 2;
				break;
			case "Wednesday":
			case "Wed":
				dayNumber = 3;
				break;
			case "Thursday":
			case "Thu":
				dayNumber = 4;
				break;
			case "Friday":
			case "Fri":
				dayNumber = 5;
				break;
			case "Saturday":
			case "Sat":
				dayNumber = 6;
				break;
			case "Sunday":
			case "Sun":
				dayNumber = 7;
				break;
			default:
				dayNumber = -2;
		}
		
		System.out.println(dayNumber);
		
		
	}
}
