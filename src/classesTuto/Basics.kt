package classesTuto

class Test (val name:String){
    constructor(name:String,age:Int) : this(name) {
        println("I am from secondary Constructor")
    }
    init {
        println("I am from Init block")
    }
}
fun main(){
    val t = Test("Dikshit")
}