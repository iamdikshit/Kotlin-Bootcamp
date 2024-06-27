package oopsproblems.polymorphismproblem

/*
*
* Hard Problem: Polymorphic Payment System Create an abstract class PaymentMethod
* with an abstract method processPayment(amount: Double). Implement two classes
* CreditCardPayment and PayPalPayment that inherit from PaymentMethod and provide their own
* implementation of processPayment().
*
*/
// Note: I have twisted the question
abstract class PaymentMethod{
    abstract fun processPayment(amount:Double)
}

open class CreditCardPayment(private val balance:Double):PaymentMethod(){
    override fun processPayment(amount: Double) {
      println("Credit card payment of $amount done successfully.")
    }
    fun getBalance():Double{
        return balance
    }
}

class PayPalPayment(balance: Double):CreditCardPayment(balance) {
    override fun processPayment(amount: Double) {
        println("PayPal payment of $amount done successfully.")
    }

     fun getBalance(type:String = "UPI"){
        println("Your balance is ${getBalance()} from paypal payment and method is $type.")
    }
}

fun main(){
    val payment = PayPalPayment(2000.0)
    println(payment.getBalance())
    payment.getBalance("Wallet")
}