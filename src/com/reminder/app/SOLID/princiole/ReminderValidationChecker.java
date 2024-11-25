package com.reminder.app.SOLID.princiole;

public class ReminderValidationChecker {

	public boolean validateReminder(Reminder reminder) {

		if (reminder.getReminderId() <= 0)
			return false;

        return !reminder.getNote().isEmpty();
    }
}
