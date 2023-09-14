package main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import javax.swing.*;

public class AgeCalculator2 {
		

	AgeCalculator2(int year, int month, int day, JLabel ly, JLabel lm, JLabel ld) {
		
		// Using libraries and methods

		LocalDate birthdate =LocalDate.of(year, month, day); 		//Birth date
		
		LocalDate now = LocalDate.now();                        	//Today's date

							

		Period period = Period.between(birthdate,now);

		
		
		// setting label values with years, months and days;
		
		ly.setText(""+period.getYears()+" Years");
		lm.setText(""+period.getMonths()+" Months");
		ld.setText(""+period.getDays()+" Days");
		

	}

}
