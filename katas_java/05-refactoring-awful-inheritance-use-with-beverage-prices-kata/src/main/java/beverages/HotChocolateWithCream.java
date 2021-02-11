package beverages;

import supplements.Cream;

public class HotChocolateWithCream extends Beverage {
    public HotChocolateWithCream() {
        super(new liquid.HotChocolate(), new Cream());
    }
}
