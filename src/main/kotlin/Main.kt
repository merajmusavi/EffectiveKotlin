package org.example

fun main() {
//    listOf(1, 2, 3)
//        .filter { it % 2 == 0 }
//        .map { it * 2 }
//        .forEach { println(it) }
//
//    // element by element
//
//    sequenceOf(1, 2, 3)
//        .filter { it % 2 == 0 }
//        .map { it * 2 }
//        .forEach { println(it) }
//
//    for (e in listOf(1,2,3,4)){
//        if (e % 2 == 0){
//            val mapped = e *2;
//            println(mapped)
//        }
//
//    }

//    val find = (1..10).filter {
//        it % 2 == 0
//    }.map { it * 2 }
//        .filter { it > 5; }
//
//    println(find)

    generateSequence(1) { it + 1 }
        .map { it * 2 }
        .take(10)
        .forEach { println(it) }

    val mutableListOf = mutableListOf<Product>()
    mutableListOf.add(Product("pride", true))
    mutableListOf.add(Product("benz", true))
    mutableListOf.add(Product("mercedes", true))
    mutableListOf.add(Product("asfwcs", true))
    mutableListOf.add(Product("AF3WCS", false))
    mutableListOf.add(Product("DSF3CSA", false))


    val filter = mutableListOf.filter { it.bought }
        .map { it.bought }

    for (product in filter) {
        println(product)
    }
    fun String.isPhoneNumber() : Boolean =
        length == 7 && all { it.isDigit() };

}

data class Product(val name: String, val bought: Boolean)