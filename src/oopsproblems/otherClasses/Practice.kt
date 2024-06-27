package oopsproblems.otherClasses

class Data{
    private var userDta = ""
    fun setData(value:String){
        userDta = value
    }
    fun getData(value:String):String{
        return userDta.ifEmpty { value }
    }
}

fun function2(getData:(value:String)->String, setData:(value:String)->Unit){
    setData("setted value")
    println( getData("default value"))
}
fun function1(getData:(value:String)->String, setData:(value:String)->Unit){
    function2(getData,setData)
}
fun main() {
    val c = Data()
    function1({value->c.getData(value)},{value->c.setData(value)})
}