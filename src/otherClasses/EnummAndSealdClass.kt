package otherClasses

/*
* ENUM : class work with constant value means its value will not change once defined
*/
enum class Weekdays(val number:Int){
//    SUN(number), this will restrict to define the dynamic value
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5);

    fun lengthOfDay(){

        println("Length : ${this.toString().length}")
    }
}
/*
* To overcome from enum class issue we have sealed class which does not restrict the dynamic
* value but restrict the type
*/

// by default sealed class is abstract class it means we cannot initialize the object.
sealed class Tile{
    class Red(val type:String, val score:Int): Tile()
    class Blue(val type:String, val score:Int):Tile()
}
fun main(){

    val objcectEnumm1 = Weekdays.FRIDAY
    println(objcectEnumm1)
    println(objcectEnumm1.number)
    objcectEnumm1.lengthOfDay()

    // Object initialization of sealed class
    val objectSealed1:Tile = Tile.Red("Fire",20)
    when(objectSealed1){
        is Tile.Red -> println("You got ${objectSealed1.score * 20} on type : ${objectSealed1.type}")
        is Tile.Blue -> println("You got ${objectSealed1.score} on type : ${objectSealed1.type}")
    }
}