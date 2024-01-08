package com.reminder.app.SOLID.princiole;

public class ReminderValidationChecker {

	public boolean validateReminder(Reminder reminder) {

		if (reminder.getReminderId() <= 0)
			return false;

		if (reminder.getNote().isEmpty()) {
			return false;
		}

		return true;
	}
}
