package com.driver;

public class Pizza {

    private int basePrice;
    private int totalPrice;
    private boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private boolean billGenerated;
    private StringBuilder bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.totalPrice = this.basePrice;
        this.bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
    }

    public int getPrice() {
        return this.totalPrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.totalPrice += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            this.totalPrice += isVeg ? 70 : 120;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            this.totalPrice += 20;
            takeawayAdded = true;
        }
    }

    public String getBill() {
        if (!billGenerated) {
            if (extraCheeseAdded) {
                bill.append("Extra Cheese Added: 80\n");
            }
            if (extraToppingsAdded) {
                bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
            }
            if (takeawayAdded) {
                bill.append("Paperbag Added: 20\n");
            }
            bill.append("Total Price: ").append(this.totalPrice).append("\n");
            billGenerated = true;
        }
        return bill.toString();
    }
}
