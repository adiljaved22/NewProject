package org.example
//Basic How to use an Array
/*
fun main(){
    val FavouriteNumbers=intArrayOf(12,3,4,10)
    println(FavouriteNumbers[0])
}*/


/*

//If the entered index is more than actual index without getting error we can use this method
fun main(){

    val FavouriteNumbers=intArrayOf(13,2,4,55)
    println(FavouriteNumbers.getOrNull(99))   --->>>using get or null
}
*/


//If the user entered number and we check it
/*fun main(){
    println("Enter your input: ")
    val input = readln()
    val FavouriteNumbers=intArrayOf(67,87,4,5,6)
    val converting=input.toIntOrNull()
        if(converting!=null && converting in 0..FavouriteNumbers.lastindex)//FavouriteNumber.size-1 bii likh sakhtaye
        {
        println("The number that user entered is : $input and the value at this index is ${FavouriteNumbers[converting]} ")
    }
    else {
        println("Dude check it and correct ")
    }*/
//adding New element in an array
fun main(){
    println("Enter your input: ")
    val input = readln()
    val FavouriteNumbers=intArrayOf(67,87,4,5,6) + 7//---->>>Adding new element in an index this should also work
    FavouriteNumbers[1]=55  //   ---->>>Changing the value of index 1
    val converting=input.toIntOrNull()
    if(converting!=null && converting in 0..FavouriteNumbers.lastIndex)//FavouriteNumber.size-1 bii likh sakhtaye
    {
        println("The number that user entered is : $input and the value at this index is ${FavouriteNumbers[converting]} ")
    }
    else {
        println("Dude check it and correct ")
    }




}