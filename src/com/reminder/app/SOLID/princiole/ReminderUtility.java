package com.reminder.app.SOLID.princiole;

import java.util.ArrayList;
import java.util.List;

public class ReminderUtility {

	List<Reminder> reminders = new ArrayList<Reminder>();
	ReminderValidationChecker checker = new ReminderValidationChecker();

	public void addReminder(Reminder reminder) {
		if (checker.validateReminder(reminder)) {
			getReminders().add(reminder);
		} else {
			System.err.println("Something went wrong");
			throw new RuntimeException("Value is not valid");
		}

	}

	public void removeReminder(int remId) {
		this.reminders.remove(remId);
		System.out.println("Remove");
	}

	public List<Reminder> getReminders() {
		return reminders;
	}

	public void setReminders(List<Reminder> reminders) {
		this.reminders = reminders;
	}

}
