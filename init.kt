fun helloWorld(){
	println("Hello, world!!")    
}

fun hello(name: String): String {
	return "Hello, ${name}!!"
}

fun show(){
	println("hello world")
}

fun varargExample(vararg names: Int){
	println("Argument has ${names.size} elements")
}

fun main(){
    val count: Int = 3
    val one: Int = 1
	val two: Int = 2
    println(count)
    println("You have $count unread messages.")
	println("One + two equals ${one + two}")
    
    
    var fooVar = 10
    fooVar = 20
    println(fooVar)
    
    val fooString = "My String Is Here!"
	val fooTemplateString = "$fooString has ${fooString.length} characters"
    println(fooTemplateString)
    
    var fooNullable: String? = "abc"
    println(fooNullable?.length)
    println(fooNullable?.length ?: -1)

    fooNullable = null
    println(fooNullable?.length ?: -1)
    
    println(hello("foo"))
    println(hello(name = "bar"))
    
    varargExample()
    varargExample(1)
    varargExample(1, 2, 3)
    
    
    fun odd(x: Int): Boolean = x % 2 == 1 
    println(odd(6))
    println(odd(7))
    
    fun even(x: Int): Boolean = x % 2 == 0 
    println(even(6))
    println(even(7))
    
    fun not(f: (Int) -> Boolean): (Int) -> Boolean {
        return { n -> !f.invoke(n) } 
    }
    
    val notOdd = not(::odd)
    val notEven = not(::even)
    
    
    println(notEven(6))
    
    val notZero = not {n -> n == 0}
    val notPositive = not { it > 0 }
    
    for(i in 0..4){
        println("${notOdd(i)} ${notEven(i)} ${notZero(i)} ${notPositive(i)}")
    }
    
    val fooExampleClass = ExampleClass(7)
    println(fooExampleClass.memberFunction(4))
    println(fooExampleClass infixMemberFunction 4) 


}

class ExampleClass(val x: Int){
    fun memberFunction(y: Int): Int{
        return x + y
    }
    
    infix fun infixMemberFunction(y: Int): Int {
        return x * y
    }
}











