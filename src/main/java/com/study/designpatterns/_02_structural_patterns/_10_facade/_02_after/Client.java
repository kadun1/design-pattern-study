package com.study.designpatterns._02_structural_patterns._10_facade._02_after;

public class Client {
    public static void main(String[] args) {
        EmailSettings settings = new EmailSettings();
        settings.setHost("127.0.0.1");
        EmailSender sender = new EmailSender(settings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("kadun");
        emailMessage.setTo("kaduns");
        emailMessage.setSubject("This is the Subject Line!");
        emailMessage.setText("This is actual message");
        sender.sendEmail(emailMessage);
    }
}
