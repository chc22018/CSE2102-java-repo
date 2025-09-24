import static org.junit.Assert.*;
import org.junit.Test;

public class PizzaFactoryTest {
    PizzaFactory factory = new PizzaFactory();

    @Test
    public void testCheesePizzaCreation() {
        Pizza pizza = factory.createPizza("cheese");
        assertTrue(pizza instanceof CheesePizza);
        assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    public void testGreekPizzaCreation() {
        Pizza pizza = factory.createPizza("greek");
        assertTrue(pizza instanceof GreekPizza);
        assertEquals("Greek Pizza", pizza.getName());
    }

    @Test
    public void testPepperoniPizzaCreation() {
        Pizza pizza = factory.createPizza("pepperoni");
        assertTrue(pizza instanceof PepperoniPizza);
        assertEquals("Pepperoni Pizza", pizza.getName());
    }

    @Test
    public void testGlutenFreePizzaCreation() {
        Pizza pizza = factory.createPizza("glutenfree");
        assertTrue(pizza instanceof GlutenFreePizza);
        assertEquals("Gluten Free Pizza", pizza.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPizzaCreation() {
        factory.createPizza("invalid");
    }
}