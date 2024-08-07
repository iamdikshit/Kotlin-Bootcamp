package controlFlow

// Practice conditional operation

fun main(){
//    lets make calculator
    println("**** WELCOME TO CALCULATOR ****")
    println("Press 1 for add")
    println("Press 2 for subtract")
    print("Enter your choice : ")
    val userInput = readln().toInt()
    when(userInput){
        1->{
            val num1 = readln().toInt()
            val num2 = readln().toInt()
            println("Sum of $num1 and $num2 is ${num1+num2}")
        }
        2->{
            val num1 = readln().toInt()
            val num2 = readln().toInt()
            println("Subtract of $num1 and $num2 is ${num1-num2}")
        }
        else->{
           println("You have entered Wrong choice!!!")
        }
    }


}