package beverages;

import supplements.Cinnamon;

public class TeaWithCinnamon extends Beverage {
    public TeaWithCinnamon() {
        super(new liquid.Tea(), new Cinnamon());
    }
}
