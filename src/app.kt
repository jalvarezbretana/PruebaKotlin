fun main() {
    println("Hello world")
    otrafuncion()
    println(sum(1, 2))
    println(sum2(1, 3))
    printSum(1, 4)
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    println("La suma de a+b+c es ${a + b + c}")
    var x = 5
    x += 1
    println("x vale $x")
    val PI = 3.14
    var xi = 0

    fun incrementX() {
        xi += 1
    }

}
fun otrafuncion(){
    println("Adios")
}
fun sum(a: Int, b: Int): Int {
       return a + b
}
fun sum2(a: Int, b: Int) = a + b
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}