package com.kw.ch03.collection.t4mutablecollection

import com.kw.ch03.Node

fun <T> LinkedList<T>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}

fun <T> Node<T>.printInReverse() {
    this.next?.printInReverse()

    if (this.next != null) {
        print(" -> ")
    }
    print(this.value.toString())
}

fun <T> LinkedList<T>.getMiddle(): Node<T>? {
    var slow = this.nodeAt(0)
    var fast = this.nodeAt(0)

    while (fast != null) {
        fast = fast?.next
        if (fast != null) {
            fast = fast.next
            slow = slow?.next
        }
    }

    return slow
}

fun <T> LinkedList<T>.reversed(): LinkedList<T> {
    fun <T> addInReverse(list: LinkedList<T>, node: Node<T>) {
        //1
        val n = node.next
        if (n != null) {
            //2
            addInReverse(list, n)
        }
        //3
        list.append(node.value)
    }

    val result = LinkedList<T>()
    val head = this.nodeAt(0)
    if (head != null) {
        addInReverse(result, head)
    }
    return result
}

fun <T: Comparable<T>> LinkedList<T>.mergeSorted(
    otherList: LinkedList<T>
): LinkedList<T> {
    if (this.isEmpty()) return otherList
    if (otherList.isEmpty()) return this

    val result = LinkedList<T>()
    //1
    var left = nodeAt(0)
    var right = otherList.nodeAt(0)
    //2
    while (left != null && right != null) {
        //3
        if (left.value < right.value) {
            left = append(result, left)
        } else {
            right = append(result, right)
        }
    }

    while (left != null) {
        left = append(result, left)
    }
    while (right != null) {
        right = append(result, right)
    }

    return result
}

private fun <T: Comparable<T>> append(
    result: LinkedList<T>,
    node: Node<T>,
): Node<T>? {
    result.append(node.value)
    return node.next
}
