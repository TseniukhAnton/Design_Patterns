package mediator;

public class Admin implements User{
    Messanger messanger;
    String name;

    public Admin(Messanger messanger, String name) {
        this.messanger = messanger;
        this.name = name;
    }

    public String getAdmin() {
        return name;
    }

    public void setAdmin(String name) {
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
