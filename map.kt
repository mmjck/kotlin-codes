data class DataClassExample(val x: Int, val y: Int, val z: Int)

data class MutableDataClassExample(var x: Int, var y: Int, var z: Int)

fun main() {
    val kotlin = "🙂"
    println(kotlin)

    val fooData = DataClassExample(-1, -2, -3)
    println(fooData)

    val fooCopy = fooData.copy(y = 100)
    println(fooCopy)

    val (a, b, c) = fooCopy
    println("$a $b $c")

    for ((a, b, c) in listOf(fooData)) {
        println("$a $b $c")
    }

    val mapData = mapOf("a" to 1, "b" to 2)
    for ((key, value) in mapData) {
        println("$key -> $value")
    }

    val fooMutableData = MutableDataClassExample(7, 4, 9)
    with(fooMutableData) {
        x -= 2
        y += 2
        x--
    }

    println(fooMutableData)

    val fooMap = mapOf("a" to 8, "b" to 7, "c" to 9)
    println(fooMap["a"])
}
