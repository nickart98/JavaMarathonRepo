package day13;

import java.util.Date;

public class Message {
    private final User sender, receiver;
    private final String text;
    private Date date = new Date();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUsername() + "\nTO: " + receiver.getUsername() + "\nON: " + this.date + "\n" + text;
    }
}
