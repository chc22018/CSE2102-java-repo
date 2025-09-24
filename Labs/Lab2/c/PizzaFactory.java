public class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "cheese":     return new CheesePizza();
            case "greek":      return new GreekPizza();
            case "pepperoni":  return new PepperoniPizza();
            case "glutenfree": return new GlutenFreePizza();
            default: throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
