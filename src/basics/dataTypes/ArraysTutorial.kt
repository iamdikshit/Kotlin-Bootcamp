package basics.dataTypes


fun main(){
    // example of arrayOf
    var listOfFruits:Array<String> = arrayOf("Orange","Apple")
    println(listOfFruits.joinToString())
    // iteration
    for( fruit in listOfFruits){
        println(fruit)
    }
    // Add new element
//     listOfFruits = listOfFruits.plus("Mango")
    listOfFruits += "Mango"
    println("After adding element : ${listOfFruits.joinToString()}")
    // removing element from array
    listOfFruits = listOfFruits.slice(IntRange(0,1)).toTypedArray()
    println("After removing element : ${listOfFruits.joinToString()}")

    println("**********EXAMPLE OF arrayOfNulls()***********")

    val studentMarks:Array<Int?> = arrayOfNulls(3)
    studentMarks[0] = 45
    studentMarks[1] = 65
    println("After adding mark : ${studentMarks.joinToString()}")

    println("**********EXAMPLE OF emptyArray()***********")
    var studentName = emptyArray<String>()
    studentName = studentName.plus("Dikshit")
    studentName = studentName.plus("Raj")

    println("After adding student : ${studentName.joinToString()}")

    println("**********EXAMPLE OF Array()***********")
    val squareValue = Array<Int>(3){i-> if(i==0) 1 else (i+1)*i}
    println("Square Value : ${squareValue.joinToString()}")
    println("**********EXAMPLE OF Multi dimension Array***********")

    val twoDArray = Array(3){Array<Int>(3){i->(i+1)*i} }
    println("2D Array : ${twoDArray.contentDeepToString()}")
    val threeDArray = Array(3){ Array(3){ Array<Int>(2){i->(i+1)*i}} }
    println("3D Array : ${threeDArray.contentDeepToString()}")

    println("**********EXAMPLE OF Spread Operator and passing number of arg ***********")

    val fruitBasket = arrayOf<String>("Banana","Apple","Oranges")
    fun printAllFruits(vararg fruits:String){
        println("All fruits: ${fruits.joinToString()}")
    }
    printAllFruits("Mango",*fruitBasket)





}