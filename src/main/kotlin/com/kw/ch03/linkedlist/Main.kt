package com.kw.ch03.linkedlist

import com.kw.ch03.Node

fun main(args: Array<String>) {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)

    // Push
    val pushList = LinkedList<Int>()
    pushList.push(3)
        .push(2)
        .push(1)

    println("Push: $pushList")

    // Append
    val appendList = LinkedList<Int>()
    appendList.append(1)
        .append(2)
        .append(3)

    println("Append: $appendList")

    // Insert
    val insertList = LinkedList<Int>()
    insertList.push(100)
        .push(200)
        .push(300)

    println("Before Inserting: $insertList")
    var middleNode = insertList.nodeAt(1)!!
    for (i in 1..3) {
        middleNode = insertList.insert(-1*i, middleNode)
    }
    println("After Inserting: $insertList")

    // Pop
    val popList = LinkedList<Int>().push(3).push(2).push(1)

    println("Before Popping: $popList")
    val poppedValue = popList.pop()
    println("After Popping: $popList [Popped value: $poppedValue]")

    // Remove Last
    val removeLastList = LinkedList<Int>().push(3).push(2).push(1)

    println("Before Remove Last: $removeLastList")
    val removedValue = removeLastList.removeLast()
    println("After Remove Last: $removeLastList [Removed value: $removedValue]")

    // Remove After
    val removeAfterList = LinkedList<Int>().push(3).push(2).push(1)

    println("Before Remove After: $removeAfterList")
    val index = 1
    val node = removeAfterList.nodeAt(index - 1)!!
    val removedValue1 = removeLastList.removeAfterNode(node)
    println("After Remove After: $removeAfterList [Removed value: $removedValue1]")
}
