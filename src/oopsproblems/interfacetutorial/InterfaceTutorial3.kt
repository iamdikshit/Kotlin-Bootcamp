package oopsproblems.interfacetutorial

// Class implementing from two interface
interface ClickableInterface3{
    fun click()
    fun showOff( ) = println("I am show off from first..")
}

interface ClickableInterface3a{
    fun showOff( ) = println("I am show off from 3a..")
}

class ButtonInterfaceClass3 : ClickableInterface3, ClickableInterface3a {
    override fun click() {
       println("I was clicked..")
    }

    override fun showOff() {
        super<ClickableInterface3a>.showOff()
        super<ClickableInterface3>.showOff()
    }
    fun printable(){
        println("I am from printable..!!")
    }
}

fun main(){
    val buttonObject3a = ButtonInterfaceClass3()
    buttonObject3a.click()
    buttonObject3a.showOff()
    buttonObject3a.printable()
}