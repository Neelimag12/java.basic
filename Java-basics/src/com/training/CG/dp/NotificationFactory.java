package com.training.CG.dp;

public class NotificationFactory {
	public Notification createNotification(String medium) {
		if(medium.equalsIgnoreCase("sms")) {
			return new SMSNotification();
		}
		else if(medium.equalsIgnoreCase("email")) {
			return new EmailNotification();
		}
		else if(medium.equalsIgnoreCase("push")) {
			return new PushNotification();
		}
		else {
			return null;
		}
		}
	}


