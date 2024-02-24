fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
    val fooList = listOf("a", "b", "c")
    
	println(fooList.size) 
    println(fooList.first()) 
    println(fooList.last())
	println(fooList[1])  
    
    
    val fooMutableList = mutableListOf("a", "b", "c")
    fooMutableList.add("d")
   
    println(fooMutableList.last())
    println(fooMutableList.size)
    
    val fooSet = setOf("a", "b", "c")
    println(fooSet.contains("a"))
    println(fooSet.contains("z"))
    
    val fooSequence = generateSequence(1, {it + 1})
    val x = fooSequence.take(10).toList()
    println(x)
}