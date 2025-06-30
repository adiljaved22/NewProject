fun main(){
    println("Enter numbers:")
    val input=readln().trim().split(" ").filter { it.isNotBlank() }.map { it.toInt() }
    val iseven=getEvenNumbers(input)
    for (numbers in iseven){
        println( "even numbers are:${numbers}")}
    val sumofneg=sumOfNegatives(input)

    println("sum of negative numbers are:${sumofneg}")
    val issquare=convertToSquares(input)
    for (square in issquare){
        println("square of numbers is:${square}")}
    val avgcount=aboveAverageCount(input)

    println("numbers greater than avg:${avgcount}")
}

//1.Even number
fun getEvenNumbers(numbers: List<Int>): List<Int>{
    val input=numbers.filter { it%2==0}
    return input
}

/*
2. sumOfNegatives:
Ek function jo sirf negative numbers ka sum kare
Aur Int return kar*/
fun sumOfNegatives(number: List<Int>): Int{
    val check=number.filter { it<0 }
    val sum=check.sum()
    return sum
}

/*3. convertToSquares:
Ek function jo har number ka square nikale
Aur List<Int> return kare*/
fun convertToSquares(number: List<Int>): List<Int> {
    val square=number.map { it*it }
    return square
}

/*4 aboveAverageCount:
Ek function jo average se zyada numbers count kare
Aur Int return kare*/

fun aboveAverageCount(number: List<Int>): Int{
    val avg=number.average()
    val ab=number.filter { it>avg }
    val count=ab.size
    return count
}