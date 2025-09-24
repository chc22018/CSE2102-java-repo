package lab3;
public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        System.out.println("Ordering Cheese Pizza...");
        Pizza p1 = store.orderPizza("cheese");
        System.out.println("Got: " + p1.getName() + "\n");

        System.out.println("Ordering Greek Pizza...");
        Pizza p2 = store.orderPizza("greek");
        System.out.println("Got: " + p2.getName() + "\n");

        System.out.println("Ordering Pepperoni Pizza...");
        Pizza p3 = store.orderPizza("pepperoni");
        System.out.println("Got: " + p3.getName() + "\n");

        System.out.println("Ordering Gluten-Free Pizza...");
        Pizza p4 = store.orderPizza("glutenfree");
        System.out.println("Got: " + p4.getName());
    }
}
