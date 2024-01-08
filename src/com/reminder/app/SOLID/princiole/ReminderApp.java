package com.reminder.app.SOLID.princiole;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ReminderApp {

	public static void main(String[] args) throws FileNotFoundException {
		Reminder cricketRem = new Reminder(101, "Play Cricker", LocalDateTime.of(2023, 12, 31, 8, 30));
		Reminder codeRem = new Reminder(102, "Code for 3 hours", LocalDateTime.of(2023, 12, 31, 10, 30));

		Reminder reminder = new Reminder();

		ReminderUtility utility = new ReminderUtility();
		utility.addReminder(codeRem);
		utility.addReminder(cricketRem);

		ReminderPrinter printer = new ReminderPrinter();
		printer.printReminder(utility.getReminders());

		ReminderDAO dao = new ReminderDAO();
		dao.saveReminder(utility.getReminders(),"monday-reminder");

	}

}
