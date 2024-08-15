package controlFlow.exceptionsTutorial

// try catch finally
fun divideOrNull(a:Int):Int{
    try{
        val b = 44/a
        println("try block: Executing division: $b")
        return b
    }
    catch (e:ArithmeticException){
        println("catch block: Encountered ArithmeticException $e")
        return -1
    }
    finally {
        println("finally block: The finally block is always executed")
    }
}

fun main(){
    // if a = 0  then it will throw exception
    divideOrNull(2)
}