
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 4th";
		String dadsBirthday = "November 25";
		String myBirthday = "September 15";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("whos B-day do you want?");
		// 3. Print out what the user typed
		if(bday.equalsIgnoreCase("Mom")){
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(bday.equalsIgnoreCase("Dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(bday.equalsIgnoreCase("You")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Idk that one");
		}
	} 
}
