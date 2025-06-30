import kotlin.math.sqrt

fun main(){
    val rect1=Rectangle(
        height = 7.8f,
        width = 7.9f,
    )
//val rect2=rect1//react 1 ki value ki rect 2 mai dai rahaye aik hi memory per h phr true DAI GA
    val rect2=Rectangle(
        height = 7.8f,
        width = 7.9f,
    )
    println(rect1==rect2)//false h q kai alag alag memory per h

    println(rect1.height)
    println(rect1.width)

    println(rect1.diagonal)
    println(rect1.area)
}
class Rectangle(val height:Float,val width:Float){
val diagonal= sqrt(height*height+width*width)
    val area=width*height
}
//IN DATA CLASS