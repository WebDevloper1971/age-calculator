package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

	Dimension size = new Dimension(700, 700);
	
	JLabel day, month, year;
	
	JLabel title, currentDay, currentMonth, currentYear;

	JTextField userDay, userMonth, userYear;

	JButton getAge;

	public GUI() {

		//---------------------------User Input Section------------------------------//
		day = new JLabel("Date");
		day.setBounds(80, 20, 80, 25);
		day.setFont(new Font("verdana", Font.BOLD, 18));
		add(day);

		userDay = new JTextField();
		userDay.setBounds(80, 50, 100, 50);
		userDay.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		userDay.setFont(new Font("verdana", Font.BOLD, 20));
		add(userDay);
		//---------------------------User Input Section------------------------------//
		
		

		//-----------------------------------------------------------------------//
		month = new JLabel("Month");
		month.setBounds(250, 20, 80, 25);
		month.setFont(new Font("verdana", Font.BOLD, 18));
		add(month);

		userMonth = new JTextField();
		userMonth.setBounds(250, 50, 100, 50);
		userMonth.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		userMonth.setFont(new Font("verdana", Font.BOLD, 20));
		add(userMonth);
		//-----------------------------------------------------------------------//
		
		
		
		
		//-----------------------------------------------------------------------//
		year = new JLabel("Year");
		year.setBounds(420, 20, 150, 25);
		year.setFont(new Font("verdana", Font.BOLD, 18));
		add(year);

		userYear = new JTextField();
		userYear.setBounds(420, 50, 150, 50);
		userYear.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		userYear.setFont(new Font("verdana", Font.BOLD, 20));
		add(userYear);
		//-----------------------------------------------------------------------//
		
		
		
		// ------------------Button---------------------------//
		getAge = new JButton("Get Age");
		getAge.setBounds(10, 150, 665, 50);
		getAge.setBackground(new Color(218, 112, 214));
		getAge.setFont(new Font("verdana", Font.BOLD, 20));
		getAge.setForeground(Color.white);
		getAge.setBorder(BorderFactory.createSoftBevelBorder(10));
		getAge.addActionListener(this);
		getAge.setFocusPainted(false);
		add(getAge);
		// ------------------Button---------------------------//
		
		

		//-------------------Output Section-------------------//
		
		title = new JLabel("Your Age is : ");
		title.setBounds(100, 250, 350, 50);
		title.setFont(new Font("verdana", Font.BOLD, 40));
		add(title);

		
		currentYear = new JLabel("00 Years");
		currentYear.setBounds(250, 350, 300, 50);
		currentYear.setFont(new Font("verdana", Font.BOLD, 40));
		add(currentYear);
		
		currentMonth = new JLabel("00 Months");
		currentMonth.setBounds(250, 450, 300, 50);
		currentMonth.setFont(new Font("verdana", Font.BOLD, 40));
		add(currentMonth);
		
		currentDay = new JLabel("00 Days");
		currentDay.setBounds(250, 550, 300, 50);
		currentDay.setFont(new Font("verdana", Font.BOLD, 40));
		add(currentDay);

		//-------------------Output Section-------------------//

		

		
		//------------------ Frame styling ------------------//
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setResizable(false);
		setSize(size);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int setYear = Integer.parseInt(userYear.getText());
		int setMonth = Integer.parseInt(userMonth.getText());
		int setDay = Integer.parseInt(userDay.getText());
		
		int arr[] = new AgeCalculator().AgeCalculatorMethod(setDay, setMonth, setYear);
		
		currentYear.setText(arr[2] + " Years");
		currentMonth.setText(arr[1] + " Months");
		currentDay.setText(arr[0] + " Days");
		
	}

}
