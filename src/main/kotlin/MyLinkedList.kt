package org.example

class MyLinkedList<T>(
    val head: T,
    val tail: MyLinkedList<T>?
)

fun <T> myLinkedListOf(
    vararg elements: T
): MyLinkedList<T>? {
    if (elements.isEmpty()) return null
    val head = elements.first()
    val tails = elements.copyOfRange(1, elements.size)
    val tail = myLinkedListOf(*tails)
    return MyLinkedList(head, tail)
}

fun main() {
    var list = MyLinkedList(1, MyLinkedList(2, MyLinkedList(3, MyLinkedList(4, null))))

    while (list != null) {
        println(list.head)
        if (list.tail == null) {
            break
        }
        list = list.tail!!
    }
    println("-----------------------------------------------------------")

    var myLinkedListOf = myLinkedListOf(1, 2, 3, 4, 5, 6)

    while (myLinkedListOf!=null){
        println(myLinkedListOf.head)
        if (myLinkedListOf.tail == null){
            return
        }
        myLinkedListOf = myLinkedListOf.tail!!
    }
}