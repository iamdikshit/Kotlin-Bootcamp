package interfacetutorial

// Defining Interface and Implementing abstract and non-abstract method

interface ClickableInterface1 {
    fun click()
}

class ButtonInterfaceClass1 : ClickableInterface1 {
    // Here we are overriding the method
   override fun click() = println("I was clicked..!")
}

fun main(){
    val buttonInterface1 = ButtonInterfaceClass1()
    buttonInterface1.click()
}