package com.kw.ch03.collection.t4mutablecollection

fun main() {
    //Removing elements
    val removingElementsList: MutableCollection<Int> = LinkedList()
    removingElementsList.add(1)
    removingElementsList.add(2)
    removingElementsList.add(3)

    println(removingElementsList)
    removingElementsList.remove(2)
    println(removingElementsList)

    //Retaining elements
    val retainingElementsList: MutableCollection<Int> = LinkedList()
    retainingElementsList.add(11)
    retainingElementsList.add(22)
    retainingElementsList.add(33)
    retainingElementsList.add(44)
    retainingElementsList.add(55)

    println(retainingElementsList)
    retainingElementsList.retainAll(listOf(11,33,55))
    println(retainingElementsList)

    //Remove all elements
    val removeAllElementsList: LinkedList<Int> = LinkedList()
    removeAllElementsList.add(111)
    removeAllElementsList.add(222)
    removeAllElementsList.add(333)
    removeAllElementsList.add(444)
    removeAllElementsList.add(555)
    removeAllElementsList.add(666)
    removeAllElementsList.add(777)

    println(removeAllElementsList)
    println("Reversed: ${removeAllElementsList.reversed()}")
    removeAllElementsList.removeAll(listOf(111,333,555))
    println(removeAllElementsList)
    println("Get Middle: ${removeAllElementsList.getMiddle()?.value}")
    removeAllElementsList.printInReverse().also { println() }

    // Merge Lists
    val list = LinkedList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    list.add(5)
    val other = LinkedList<Int>()
    other.add(-1)
    other.add(0)
    other.add(2)
    other.add(2)
    other.add(7)

    println("Left: $list")
    println("Right: $other")
    println("Merged: ${list.mergeSorted(other)}")
}
