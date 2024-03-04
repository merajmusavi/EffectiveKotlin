package org.example

import kotlin.concurrent.thread

val name: String? = "meraj"
val lname: String? = "musavi"

val fullName: String?
    get() = name?.let { "$it $lname" }

val fullname2: String? = name?.let { "$it  $lname" }

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val toMutableList = list.toMutableList()


}