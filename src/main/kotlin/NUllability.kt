package org.example


fun main(){
    println("enter number")
    val input=readln()

    val inputasinteger=input.toIntOrNull()?.rem(2)?.equals(0)
    println("Is this input is even:: $inputasinteger")
}
