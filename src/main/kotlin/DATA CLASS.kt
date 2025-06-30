import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle2(
        height = 7.8f,
        width = 7.9f,
    )
    //val rect2 = rect1.copy(height=99f)//using copy in data
    //data class mai context compare karta h
  val rect2 = Rectangle2(
        height = 7.8f,
        width = 7.9f,
    )
    println(rect1 == rect2)
val cir=circle(
    radius = 7.8f,

)
    println(cir.area)
    println(cir.diameter)
    /*  println(rect1.height)
      println(rect1.width)

      println(rect1.diagonal)
      println(rect1.area)*/
}

data class Rectangle2(val height: Float, val width: Float) {
    val diagonal = sqrt(height * height + width * width)
    val area = width * height

}

 class circle(val radius: Float){
    val area=radius*radius* PI
     val diameter=2*radius
}
