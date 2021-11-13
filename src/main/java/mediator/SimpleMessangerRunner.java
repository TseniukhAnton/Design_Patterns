package mediator;

public class SimpleMessangerRunner {
    public static void main(String[] args) {
        SimpleTextMessanger chat = new SimpleTextMessanger();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hi I'm user 1!!!!");
        //admin.sendMessage("Hi I'm admin   !!!!");

    }
}
