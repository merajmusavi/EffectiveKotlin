package org.example

    fun main() {
        val news = mutableSetOf<news>()
        news.add(news(true, "salam"))
        news.add(news(true, "bye"))
        news.add(news(true, "hello"))
        news.add(news(true, "chery"))
        news.add(news(true, "chery"))
        news.add(news(true, "lady"))
        news.add(news(true, "kkk"))
        news.add(news(true, "jjj"))

        val map = news.filter { it.visibility  }
            .map { it.name.startsWith("b") }
        for (b in map) {
            println(b)
        }

    }

data class news(
    val visibility: Boolean,
    val name: String
)