package interfacetutorial

// Defining Interface and default Implementation

interface ClickableInterface2 {
    fun click()
    fun showOf() = println("I am show off..!")
}

class ButtonInterfaceClass2 : ClickableInterface2 {
    // Here we are overriding the method
    override fun click() = println("I was clicked..!")
}

fun main(){
    val buttonInterface2 = ButtonInterfaceClass2()
    buttonInterface2.click()
    buttonInterface2.showOf()
}