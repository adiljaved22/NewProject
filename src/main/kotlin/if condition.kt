package org.example



fun main(){
    println("Enter any number:")
  val new=readln()
     val convertingint=new.toIntOrNull()
    println("Entered number is :$convertingint")
    if(convertingint!=null) {

        if (convertingint% 2 == 0) {
                println("Even")
        } else {
            println("Odd")
        }

    }
    else {
    println("Enter valid number")
    }
    }


