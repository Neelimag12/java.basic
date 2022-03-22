package com.training.CG.dp;

public class FactoryDesign {
	public static void main(String args[]) {
		NotificationFactory factory=new NotificationFactory();
		Notification notification=factory.createNotification("email");
		notification.notifyUser();
		
	}

}
