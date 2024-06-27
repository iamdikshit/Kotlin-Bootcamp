package oopsproblems.polymorphismproblem

/*
Easy Problem: Polymorphic Greetings
Create an interface Greeting with a method sayHello().
Implement two classes EnglishGreeting and HinglishGreeting that implement the
Greeting interface and provide their own implementation of sayHello(). Write a function
that takes a list of Greeting objects and calls sayHello() on each.
 */

interface Greeting{
    fun SayHello()
}

class EnglishGreeting:Greeting{
    override fun SayHello() {
        println("Hello!")
    }
}

class HinglishGreeting:Greeting{
    override fun SayHello() {
        println("Kya haal hai?")
    }
}

fun greetingsAll(greetings: List<Greeting>
){
    for (greet in greetings){
        greet.SayHello()
    }
}

fun main() {
    val greetings = listOf(EnglishGreeting(), HinglishGreeting())
    greetingsAll(greetings)
}