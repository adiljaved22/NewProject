
package org.example
/*
fun main(){
    println("How many numbers u want to enter")
    val TotalNumbers=readln().toIntOrNull()?:0
var sum=0
    var i=0
    while (i<TotalNumbers){
    println("Enter numbers is: #${i+1}")
        val number=readln().toIntOrNull()?:0
        sum +=number
        i++
    }
    println("Sum of all numbers is :$sum")


}*/


/*
using contine statment
fun main(){
    println("How many numbers u want to enter")
    val TotalNumbers=readln().toIntOrNull()?:0
var sum=0
    var i=0
    while (i<TotalNumbers){
    println("Enter numbers is: #${i+1}")
        val number=readln().toIntOrNull()?:continue //continue sai iteration aagaye ni barhaye gii balkaye wo bar  bar wohi print hoo ga jb tk valid number enter ni ho ga

        sum +=number
        i++
    }
    println("Sum of all numbers is :$sum")


}
*/
//printing full array entered by user
/*fun main(){
    println("Enter numbers ")
    var array=intArrayOf()
    val no=readln().toIntOrNull()?:0
    var i=0
    while( i < no){
        print("Enter numbers : #${i+1}\n")

        val input=readln().toIntOrNull()?:continue
        array+=input
        i++

    }
    //println("${array}")//IS tarhann error aye ga garbage value array jb print hoo gii assaye hoo gi
    println("${array.contentToString()}")

}*/

//Another method of printing an Array
/*
fun main(){
    println("Enter numbers ")
    var array=mutableListOf<Int>()
    val no=readln().toIntOrNull()?:0
    var i=0
    while( i < no){
        print("Enter numbers : #${i+1}\n")

        val input=readln().toIntOrNull()?:continue
        array.add(input)
        i++

    }
    //println("${array}")//IS tarhann error aye ga garbage value array jb print hoo gii assaye hoo gi
    println("${array}")

}
*/
