package controlFlow


fun main(){

//    for (i in 1..3) {
//        println(i)
//    }
//
//    for (i in 6 downTo 0 step 2) {
//        println(i)
//    }

    // return , break, continue

        for (i in 1..5) {
        if(i==4){
            break
        }
            println(i)
    }

    for (i in 1..5) {
        if(i==4){
            continue
        }
        println(i)
    }
}