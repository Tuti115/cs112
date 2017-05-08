




public class PizzaOrder
{
    /* Initializations */
    public static final int MAX_PIZZA_COUNT = 50;
    public static final double small_pizza_cost = 8.00;
    public static final double medium_pizza_cost = 10.00;
    public static final double large_pizza_cost = 12.00;
    public static final double topping_cost = 1.00;

    private int numPizza = 0;
    private double total_cost = 0;
    private Pizza[] order = new Pizza[MAX_PIZZA_COUNT];

    /* Accessor Methods */
    public int getNumPizza()
    {
        return this.numPizza;
    }
    public double getTotal_cost()
    {
        return this.total_cost;
    }

    /* Mutator Methods */
    public void setNumPizza(int numPizza)
    {
        this.numPizza = numPizza;
    }

    public void incrementNumPizza()
    {
        this.numPizza++;
    }
    public void setTotal_cost(double totalcost)
    {
        this.total_cost = totalcost;
    }

    public void addToTotal_Cost(double morecost)
    {
        this.total_cost += morecost;
    }

    /* Constructor */
    public PizzaOrder()
    {
        this.numPizza = 0;
        this.total_cost = 0;
    }

    /* Methods */
    public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushroom)
    {
        Pizza pizza = new Pizza(size, pepperoni, sausage, mushroom);
        order[getNumPizza()] = pizza;

        incrementNumPizza();
    }//end of method

    public double calcCost()
    {
        double pizza_cost = 0;

        setTotal_cost(0);
        for(int i = 0; i < getNumPizza(); i++)
        {
            pizza_cost = 0;
            pizza_cost += calcCostOfSize(order[i]);
            pizza_cost += calcCostOfToppings(order[i]);

            addToTotal_Cost(pizza_cost);
        }

        return getTotal_cost();

    }//end of method

    public double calcCostOfSize(Pizza somepizza)
    {
        char size = somepizza.getSize();

        if(size == 'S')
        {
            return small_pizza_cost;
        }

        if(size == 'M')
        {
            return medium_pizza_cost;
        }

        if(size == 'L')
        {
            return large_pizza_cost;
        }

        return -1;
    }

    public double calcCostOfToppings (Pizza pizza)
    {
        double cost_toppings = 0;

        if(pizza.isPepperoni())
        {
            cost_toppings += topping_cost;
        }

        if(pizza.isSausage())
        {
            cost_toppings += topping_cost;
        }

        if(pizza.isMushrooms())
        {
            cost_toppings += topping_cost;
        }

        return cost_toppings;
    }

    public String toString()
    {
        return "Total cost of pizza order: " + getTotal_cost();
    }



}//end of class




