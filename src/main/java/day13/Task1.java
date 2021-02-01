package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Bob");
        User u2 = new User("Tom");
        User u3 = new User("Jay");

        u1.sendMessage(u2, "Hi, Tom!");
        u1.sendMessage(u2, "How are you?");

        u2.sendMessage(u1, "Hi, Bob!");
        u2.sendMessage(u1, "I'm fine.");
        u2.sendMessage(u1, "What will you do today?");

        u3.sendMessage(u1, "Hi, Bob!");
        u3.sendMessage(u1, "How are you?");
        u3.sendMessage(u1, "What will you do today?");

        u1.sendMessage(u3, "Hi, Jay!");
        u1.sendMessage(u3, "I'm fine.");
        u1.sendMessage(u3, "No plans.");

        u3.sendMessage(u1, "OK.");

        MessageDatabase.showDialog(u1, u3);
    }
}
