package main;

import java.time.LocalDate;
import java.util.Arrays;

public class AgeCalculator {

	public AgeCalculator() {
		
	}
	
	public int[] AgeCalculatorMethod(int day, int month, int year) {
		int arr [] = new int[3];
		
		int reqDay = 0;
		int reqMonth = 0;
		LocalDate d = LocalDate.now();
		
		
		int d1 = d.getDayOfMonth();
		int m1 = d.getMonthValue();
		int y1 = d.getYear();
//		System.out.println(d1 +"--"+ m1 +"--"+ y1);
		
		int d2 = day;
		int m2 = month;
		int y2 = year;
//		System.out.println(d2 +"--"+ m2 +"--"+ y2);
		
		
		// We will first check Day then Month then Year
		
		
		// If day is greater than current day subtract it from 30/31 and add +1 in month.
		
		if(d2 > d1) {
			if(m2 == 1 || m2 == 3 || m2 == 5 || m2 == 7 || m2 == 8 || m2 == 10 || m2 == 12 ) {
				reqDay = 31 - d2;
			}
			else {
				reqDay = 30 - d2;
			}
			d2 = 1;
		}
		
		
		// if month is greater than current month subtract it from 12 and add +1 in year.
		
		if(m2 > m1) {
			reqMonth = 12 - m2;
			m2 = 1;
		}
		
		// if month > 13 then add +1 year.
		
		if(m2 > 12) {
			y2 += 1;
			m2 = 1;
		}
		
		// if reqDay is change that means we add +1 in month.
		
		if(reqDay > 0) {
			m2 += 1;
		}
		
		// similarly if reqMonth is change that means we add +1 in year.
		
		if(reqMonth > 0) {
			y2 += 1;
		}

		
		int dayDiff = (d1 - d2)+reqDay;
		int monthDiff = (m1 - m2)+reqMonth;
		int yearDiff = y1 - y2;
		
		
//		System.out.println(dayDiff+"--"+monthDiff+"--"+yearDiff);
		
		arr[0] = dayDiff;
		arr[1] = monthDiff ;
		arr[2] = yearDiff;
		
//		 System.out.println(Arrays.toString(arr));


		return arr;
	}


}
