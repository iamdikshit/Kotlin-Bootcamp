package modifierTutorial

abstract class ModifierTutorialAbstactClass1 {
    // abstract function : must be overridden in subclass
    abstract fun printable()
    // open method can be overriden
    open fun show(){
        println("I am show from base class..!")
    }
    // display is final method so it can not be overriden
    fun display(){
        println("I am display from base class..!")
    }
}

class ModifierTutorialSubClass2 : ModifierTutorialAbstactClass1(){
    override fun printable() {
       println("I am printable, from sub class")
    }

    override fun show() {
        super.show()
    }
}

fun main(){
    val modifierObject2 = ModifierTutorialSubClass2()
    modifierObject2.printable()
    modifierObject2.display()
    modifierObject2.show()

}