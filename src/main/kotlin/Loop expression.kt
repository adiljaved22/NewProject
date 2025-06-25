package org.example

fun main(){
    println("How many numbers u want to enter")
    val TotalNumbers=readln().toInt()
var sum=0
    var i=0
    while (i<TotalNumbers){
        val number=readln().toInt()
        sum +=number
        i++
    }
    println("$sum")


}