package org.example

fun main(){
    val seq = sequenceOf(1,2,3,4,5,6,7)
    val filtered = seq.filter { it % 2 == 0 }
    println(filtered)
    val qe = listOf(1,2,3,4,5,6,7)

    val filtered2 = qe.filter { it % 2 == 0 }

    println(filtered2)


}