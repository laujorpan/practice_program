package beverages;

import liquid.Liquid;
import supplements.Supplement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Beverage {

    private final Liquid liquid;
    private final List<Supplement> supplements = new ArrayList<>();

    Beverage(Liquid liquid) {
        this.liquid = liquid;
    }

    Beverage(Liquid liquid, Supplement... supplements) {
        this(liquid);
        this.supplements.addAll(Arrays.asList(supplements));
    }

    public final double price() {
        return liquid.price() + supplements.stream().mapToDouble(Supplement::price).sum();
    }
}
