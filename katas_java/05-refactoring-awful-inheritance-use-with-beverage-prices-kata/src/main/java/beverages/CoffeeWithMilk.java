package beverages;

import supplements.Milk;

public class CoffeeWithMilk extends Beverage {
    public CoffeeWithMilk() {
        super(new liquid.Coffee(), new Milk());
    }
}
