package controlFlow.exceptionsTutorial

/*
* Basic exceptions : IllegalArgumentException, IllegalStateException
*/

// require()

fun getIndices(count:Int):List<Int>{
    require(count>0){"Count must be greater than 0"}
    return List(count){it+1}
}

// error

class User(val name: String, val role: String)

fun processUserRole(user: User) {
    when (user.role) {
        "admin" -> println("${user.name} is an admin.")
        "editor" -> println("${user.name} is an editor.")
        "viewer" -> println("${user.name} is a viewer.")
        else -> error("Undefined role: ${user.role}")
    }
}
fun main(){

    /*
    val userInput:Int = -1
    // Original cause of error
    val cause = IllegalStateException("Original cause: illegal statement")
    if (userInput < 0) {
        throw IllegalArgumentException("Input must be non-negative", cause)
    }
     */

    // We have precondition functions
    /*
        require() : check user input validity  | IllegalArgumentException
        check() : checks object or variable state validity | IllegalStateException
        error() : Indicates and Illegal state or condition | IllegalStateException
     */

    // require()
//    println(getIndices(-1))
    println(getIndices(3)) // [1, 2, 3]

    // check()
    val name:String? = null
//    check(name!=null){"State must be non-empty!"} // this will throw error
    println(name)

    // error generally use in when condition
//    val user = User("Dikshit","employee")
//    processUserRole(user) // this will throw error




}