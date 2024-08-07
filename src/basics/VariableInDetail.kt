package basics

enum class Priority(val color: String) {
    High("Color.Red"),
    Medium("Color.Yellow"),
    Low("Color.Green"),
    None("Color.White")
}

class Converters {

    fun fromPriority(priority: Priority):String{
        return priority.name
    }

    fun toPriority(priority: String):Priority{
        return Priority.valueOf(priority)
    }
}

fun main(){
    val c = Converters()
    println(c.fromPriority(Priority.Low))
    println(c.toPriority("LOW"))

}