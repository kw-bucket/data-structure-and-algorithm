package com.kw.ch03.collection.t1iterable

fun main(args: Array<String>) {
    val linkedList = LinkedList<Int>().push(3).push(2).push(1)
    println(linkedList)

    for (item in linkedList) {
        println(":: $item")
    }
}
