package com.reminder.app.SOLID.princiole;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class ReminderDAO {

	public void saveReminder(List<Reminder> reminderList, String fileName) throws FileNotFoundException {

		ReminderUtility utility = new ReminderUtility();

		PrintStream stream = new PrintStream(
				"C:\\Users\\chinmay1.jain\\Documents\\eclipseWorkspace\\gitFolder\\DSA-Algorithm\\" + fileName);
		for (Reminder reminder : reminderList) {
			stream.println(reminder);
		}
		stream.close();
		System.out.println("Data save successfully");
	}

}
