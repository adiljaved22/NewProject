package org.example

fun main(){
    val x = 20
    val y=80
    val bothsame=x%2==0 ||(y%2==0 && x+y==10)
    println("is this overall expression is even:$bothsame")
}