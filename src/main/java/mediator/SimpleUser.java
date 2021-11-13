package mediator;

public class SimpleUser implements User{
    Messanger messanger;
    String name;

    public SimpleUser(Messanger messanger, String name) {
        this.messanger = messanger;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        messanger.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
