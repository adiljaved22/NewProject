package org.example
// Printing numbers that the user enter in list
/*fun main(){
    println("Enter any numbers:")
    val listt=mutableListOf<Int>()
    val input=readln().toIntOrNull()?:0
    for(i in 1..input){
        println("Enter $i")
        val input=readln().toIntOrNull()?:continue
    listt.add(input)

    }



    for(numbers in listt)  //printing in an
   //println("$listt") //printing in an array

      {  println("you have entered :")
        println("$numbers")
    }

}*/


//printing a string
/*fun main(){
    println("Enter string:")
    val input=readln()
    for(ch in input){
        println(ch)
    }
}*/

//printing string in an reverse order.
/*
fun main(){
    println("Enter anything u want to enter:")
    val input=readln()
    for(i in input.lastIndex downTo 0){
        val carry=input[i]

        println(carry)
    }


}*/


//using build string

/*
fun main(){
    println("Enter anything u want to enter:")
    val input=readln()
    val reversed=buildString {
        for(i in input.lastIndex downTo 0){

            append( input[i])
        }


    }
    println("Reversed $reversed")


}*/
