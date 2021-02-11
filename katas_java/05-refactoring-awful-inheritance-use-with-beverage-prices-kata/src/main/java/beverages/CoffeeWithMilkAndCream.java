package beverages;

import supplements.Cream;
import supplements.Milk;

public class CoffeeWithMilkAndCream extends Beverage {
    public CoffeeWithMilkAndCream() {
        super(new liquid.Coffee(), new Milk(), new Cream());
    }
}
