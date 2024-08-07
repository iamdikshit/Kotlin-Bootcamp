package datastructure.linkedlist

import java.util.LinkedList

fun main(){
    val linkedList = LinkedList<Int>()
    linkedList.add(1)
    linkedList.add(23)
    linkedList.add(34)
    linkedList.add(40)
    for (i in linkedList){
        println(i)
    }
}