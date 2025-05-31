public class DeluxPizza extends pizza{

    public DeluxPizza(Boolean veg) {
        super(veg);
        //super.addExtraCheese();
        //super.addExtraToppings();
    }

    @Override
    public void addExtraCheese()
    {
        this.price += extraCheesePrice;
    }

    @Override
    public void addExtraToppings() 
    {
        this.price += extraToppingsPrice;
    }
}
