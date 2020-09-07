package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private List<User> subscriptions = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User subscription : subscriptions) {
            if (subscription.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {

        for (int i = 0; i < user.getSubscriptions().size(); i++) {
            if(user.getSubscriptions().get(i).equals(this) && isSubscribed(user)) {
                return true;
            }
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return "Имя пользователя: " + username;
    }
}
