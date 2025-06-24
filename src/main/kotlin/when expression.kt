package org.example
//1 method
/*fun main(){
    println("Enter any  number")
    val no=readln()
    val input=no.toIntOrNull()
    if(input != null){
        val output= when{
            input%2==0 -> "Always even"
            input<10 ->"Odd number && less than 10"
                    else ->"Odd number and greater than 10"
        }
        println("$output")
    }


}*/
//2nd method
fun main(){
    println("Enter number")
    val no=readln()
    val input=no.toIntOrNull()
    if(input!=null){
        val output=when(input){
            3->"Number is 3"
            4->"Number is 4"
            5->"Number is 5"


            else->"null"
        }
        println(output)
    }
    else{
        println("Invalid input")
    }
}