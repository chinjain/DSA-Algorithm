package com.reminder.app.SOLID.princiole;

import java.util.List;

public class ReminderPrinter {

	public void printReminder(List<Reminder> reminders) {
		reminders.forEach(System.out::println);
	}

}
