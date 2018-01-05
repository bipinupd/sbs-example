package com.bu;

import scala.collection.mutable.ArrayBuffer

case class Topping(name: String)

class Pizza {
  
  private val toppings = new ArrayBuffer[Topping]
  
  def addTopping (t: Topping) { toppings += t}
  def removeTopping (t: Topping) { toppings -= t}
  def getToppings = toppings.toList
  
  def allToppingsThatCanBeSelected {
      println("1. Pepperoni")
      println("2. Sausage")  
      println("3. Caramelized onions")
    }
}