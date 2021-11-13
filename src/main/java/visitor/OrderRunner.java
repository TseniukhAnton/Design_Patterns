package visitor;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order();

        Driver jung = new JungDriver();
        Driver expert = new ExperiencedDriver();

        System.out.println("Jung in action");
        order.beDone(jung);

        System.out.println("\n===============================================================================\n");

        System.out.println("Expert in action");
        order.beDone(expert);
    }
}
