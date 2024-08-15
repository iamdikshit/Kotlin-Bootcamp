package oopsproblems.inheritanceProblem

// Basic Inheritance

// Base class
/*
* Here we have declared Person class with two property
* 1-name, 2-age
* to make inheritable Person class we have mention open before Person class
*/
open class Person( val name:String,  val age:Int){
    /*
    * We have mentioned display function as open
    * so that we can override the function
    * */
    open fun display(){
        println("User detail : \n name:$name, age:$age")
    }
    fun getUserName():String{
        return name
    }
    fun getUserAge():Int{
        return age
    }
}

/*
* Employee class inheriting from Person class and Person class have two parameter, so we need
* to give these two parameter in primary construction of Employee class
*
* */
class Employee(
    name:String,
    age:Int,
    private var salary:Int?,
    private val band:Char
    ):Person(name,age){
        init {
            // this block will run after primary construction
            println("Employee $name register successfully!")
        }

        /*
        * We have overriding the display function by using override keyword
        */
    override fun display() {
        println("User detail : \n Name:$name, Age:$age, Band:$band")
    }
    fun getSalary():Int?{
        return salary
    }

    fun setSalary(salary:Int){
        this.salary = salary
        println("Salary updated successfully!")
    }
}

fun main(){
    val listOfUsers:List<Employee> = listOf(
        Employee("Dikshit",27,null,'B'),
        Employee("Raj",23,null,'A'),
        Employee("Rakesh",25,23000,'B')
    )

    println(listOfUsers)
    listOfUsers[0].display()
}

