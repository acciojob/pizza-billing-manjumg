package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    // prevent further additions
    @Override
    public void addExtraCheese() {
        // already added in constructor
    }

    @Override
    public void addExtraToppings() {
        // already added in constructor
    }
}
