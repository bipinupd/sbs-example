package com.bu
import org.scalatest._

class PizzaTests extends FlatSpec with BeforeAndAfter {
  
  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }

  "A new pizza" should  "have zero toppings" in {
    assert(pizza.getToppings.size == 0)
  }

  "adding one topping" should "increase the number of toppings by one"  in {
    val previousNum = pizza.getToppings.size
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size == previousNum + 1)
  }
  
  "A pizza" should " have cost asscoiated with it" is (pending)
}