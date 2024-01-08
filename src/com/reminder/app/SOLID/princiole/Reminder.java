package com.reminder.app.SOLID.princiole;

import java.time.LocalDateTime;

/*
 * SOLID 
 * 
 * S - Single Responsiblity
 * O - Open for extesion and closed for modification 
 * l - lisvok 
 * I - Interface Saggregation 
 * D - Dependency Injection 
 * 
 * OCP : Every Software should Open for extension and Closed for modifications !!
 * 
 * 
 */

public class Reminder {

	private int reminderId;
	private String note;
	private LocalDateTime timestamp;

	public Reminder(int reminderId, String note, LocalDateTime timestamp) {

		this.reminderId = reminderId;
		this.note = note;
		this.timestamp = timestamp;
	}

	public Reminder() {

	}

	public int getReminderId() {
		return reminderId;
	}

	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Reminder [reminderId=" + reminderId + ", note=" + note + ", timestamp=" + timestamp + "]";
	}

}
