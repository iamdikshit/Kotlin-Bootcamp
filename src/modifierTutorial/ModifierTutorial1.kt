package modifierTutorial

// Base class : by default it is final unless and until we marked it as open or abstract
// we can't inherit this base class because of final
class ModifierTutorialBaseClass1{
    fun printable() = println("I am printable from Base class..!")
}

// Base class, and It is open : this means we can inherit this class

open class ModifierTutorialBaseClass2 {
    // this function is final, so we can't override it in subclass
    fun printable() = println("I am printable from Base class 2..!")
    open fun show() = println("I am show function from Base class 2..!")

}

class ModifierTutorialSubClass1 : ModifierTutorialBaseClass2() {
//    Here we can not override printable as we discussed
//    override fun printable() = println("")
    override fun show() {
        println("I am show function from Sub class..!")
    }
}

fun main(){
    val modifierObject1 = ModifierTutorialSubClass1()
    modifierObject1.show()
    modifierObject1.printable()
}


