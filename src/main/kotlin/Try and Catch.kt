package org.example

fun main(){
    println("Enter your input: ")
  val no=readln()
    println("Entered  input is $no")
    val input=try {
        no.toInt()
    }catch (e: NumberFormatException){
        1
    }
    val output=when(input) {
        2 -> "Number is 2"
        3 -> "Number is 3"
         in 3..12 -> "Number is between 3 and 12"
        else -> "Nothing happens dude"
    }
    println("$output")

}
