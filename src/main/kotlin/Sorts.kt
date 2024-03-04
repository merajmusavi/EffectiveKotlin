package org.example

import java.util.*

fun main() {
    // Create a sorted set of integers
    val sortedSet: SortedSet<Int> = sortedSetOf(5, 2, 7, 1, 8, 3)

    // Add elements to the sorted set
    sortedSet.add(6)
    sortedSet.addAll(listOf(4, 9))

    // Print the sorted set
    println("Sorted Set: $sortedSet")

    // Accessing elements
    println("First element: ${sortedSet.first()}")
    println("Last element: ${sortedSet.last()}")

    // Subsets
    val subset = sortedSet.subSet(3, 7) // Subset containing elements between 3 (inclusive) and 7 (exclusive)
    println("Subset: $subset")

    // Removing an element
    sortedSet.remove(6)
    println("Sorted Set after removing 6: $sortedSet")
}
