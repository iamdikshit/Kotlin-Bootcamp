package otherClasses


// Nested Classes

class NestedClassesPrac1(var name:String?="User"){
    fun getUserName(): String? {
        return this.name
    }
    fun setUserName(name:String){
        this.name = name
    }

    // Nested class: which do not have access of property of outer class
    class RealNestedClass1(){
        fun display(){
//            println(name) : this will through error because it does not have access
            println("I am from Nested class..")
        }
    }
}


// Inner class : Have the access of the outer class properties

class InnerClassPrac1(var name:String?="User"){
    fun getUserName(): String? {
        return this.name
    }
    fun setUserName(name:String){
        this.name = name
    }

    // inner class : with inner keyword
    inner class RealInnerClass(){
        fun lengthOfUserName(): Int? {
            return getUserName()?.length
        }
    }

}


fun main(){
    val nestedObject1 = NestedClassesPrac1("Dikshit")
    println(nestedObject1.getUserName())
    nestedObject1.setUserName("Anirban")
    println(nestedObject1.getUserName())

    // to use nested class the following below syntax are used
    // <outerClassName>.<nestedClassName>().<methodName>
    NestedClassesPrac1.RealNestedClass1().display()


    //***** Inner class example **********
    val innerObject1 = InnerClassPrac1("Dikshit")
    println(innerObject1.getUserName())
    innerObject1.setUserName("Anirban")
    println(innerObject1.getUserName())

    // to use inner class the following below syntax are used
    // <outerClassName>().<nestedClassName>().<methodName>
    println(InnerClassPrac1().RealInnerClass().lengthOfUserName())
}