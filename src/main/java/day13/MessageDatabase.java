package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static void showDialog(User u1, User u2) {
        int count = 0;
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).getSender().equals(u1) && messages.get(i).getReceiver().equals(u2)) {
                System.out.println(u1.getUsername() + ": " + messages.get(i).getText());
                count++;
            }
            if (messages.get(i).getSender().equals(u2) && messages.get(i).getReceiver().equals(u1)) {
                System.out.println(u2.getUsername() + ": " + messages.get(i).getText());
                count++;
            }
        }
        if (count == 0)
            System.out.println("----------------------------\nThere is no messages\n----------------------------");
    }
}
