package org.example

import javax.swing.DefaultListSelectionModel

fun main(){
 println("Enter Any Number")
    val no=readln()
    println("Entered number is $no")
    val convertingint=no.toInt()
    val even =convertingint%2==0
    println("Is this even: $even")
}
