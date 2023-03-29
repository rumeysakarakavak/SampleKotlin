package org.csystem.app

fun main()
{
    /*declaretions()
    stringFormat()
    shadowing(2, 4.0)
    readFromKeyboard()
    returnTypesAndLocalFunctions()
    singleExpressionFunctions()
    defaultArgs()*/

}

fun declaretions()
{
    val avogadroNumber: Double = 6.02E23
    var a : Int
    var b = 3.4
    val c : Char = 'a'
    var d = c

    var newInt = 4
    val newInt2 = 3

    var newInt3 : Int = 5
    val newInt4 : Int = 6

    println(newInt)
    println(newInt2)
    println(newInt3)
    println(newInt4)

    newInt3 =9975456
    println(newInt3)

    // Val cannot be reassigned because val declaration is like const
    //newInt4 = 8

    println("Avogadro Number = $avogadroNumber")
}

fun stringFormat()
{
    val a = 1
    val b = 2.5

    println("a = $a, b = $b");
    println("a = %d, %.1f".format(a,b))
    val msg = "a = $a, b = $b"
    println(msg)

    // string interpolation
    println("$a + $b = ${a + b}");
}

fun shadowing(b:Int, c:Double)
{
    val a: Int
    a = 45
    // it is like a new function but will update soon
    run {
        println("a = $a")
        val a: Double = 23.6

        println("a = $a")
    }

    println("a=$a")

    // shadowing of arguments
    var b = b
    var c = c

    b *= 2
    c -= 4
    println("b = $b, c = $c")
}

fun readFromKeyboard()
{
    // int
    print("Bir sayı giriniz:")
    val a = readLine()!!.toInt()
    println("${a * a}")

    // int
    print("Bir sayı giriniz:")
    val b = readln().toInt()
    println("${b * b}")

    // double
    print("Bir sayı giriniz:")
    val c = readln().toDouble()
    println("${c * c}")

    // long
    print("Bir sayı giriniz:")
    val d = readln().toLong()
    println("${d * d}")
}

fun returnTypesAndLocalFunctions()
{
    // if you want to return a type from function, you have to specify it after : this mark
    fun foo() : Int
    {
        println("return int")
        return 10
    }

    fun bar() : Double
    {
        println("return double")
        return  10.0
    }

    fun tar() //since 1.1
    {
        println("return void")
    }

    // Unit equals void in Kotlin, you can return Unit
    fun car() : Unit
    {
        println("return void == Unit")
    }

    // they are local function, you can reach them just in this scope
    foo()
    bar()
    tar()
    car()
}

// if the function is a single expression function, you can write it without a body
fun add(a: Int, b: Int) = a + b
fun display(a: Int, b: Double) = println("a = $a, b = $b")
fun hello() = println("Hello")
fun singleExpressionFunctions()
{
    hello()
    display(10, 4.5)
    println(add(10, 20))
}

fun constArguments(a: Int, b: Double)
{
    // you cannot change argument values
    // a *= 2 //error
    println("a = $a, b = $b")
}

// function with default arguments
fun addArgs(a: Int = 0, b: Int = 0) = a + b
fun namedArgs(a: Int = 67, b: Double, c: Char) = println("a=$a, b=$b, c=$c")
fun defaultArgs()
{
    println(addArgs())
    println(addArgs(10))
    println(addArgs(10, 20))
    namedArgs(b = 3.4, c = 'd')
}
