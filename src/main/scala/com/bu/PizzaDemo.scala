package com.bu

object PizzaDemo extends App {

  val pizza = new Pizza
  pizza.allToppingsThatCanBeSelected
  println("Type toppings : ")
  val input = scala.io.StdIn.readLine()
  println("You selected type: " + input)
  println("Enjoy you pizza")
}