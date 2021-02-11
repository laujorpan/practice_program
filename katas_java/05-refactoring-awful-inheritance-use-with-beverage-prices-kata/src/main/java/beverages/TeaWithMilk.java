package beverages;

import supplements.Milk;

public class TeaWithMilk extends Beverage {
    public TeaWithMilk() {
        super(new liquid.Tea(), new Milk());
    }
}
