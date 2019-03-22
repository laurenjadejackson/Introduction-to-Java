package uk.ac.mmu.dtsda.itp.lecture10.pizza;

public class TestPizzaShop
{
  public static void main(String[] args)
  {
    //Part 3a
    PizzaShop pizzaShop = new PizzaShop();
    
    //Part 3b
    Customer [] customers = pizzaShop.getCustomers();    
    Pizza [] allPizzas = pizzaShop.getPizzas();
    
    //create a new order
    Customer orderingCustomer = customers[1];
    Pizza [] orderedPizzas = new Pizza [1];
    orderedPizzas[0] = allPizzas[1];
    orderedPizzas[1] = allPizzas[1];
    pizzaShop.addOrder(orderingCustomer, orderedPizzas);
    
    //create 2 more orders
    
  }

}
