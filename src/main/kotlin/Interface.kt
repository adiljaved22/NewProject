import kotlin.math.PI
/*
Define the Shape interface which includes:
An abstract area property
An abstract circumference property
Create Rectangle and Circle data classes that implement the Shape interface.
Provide correct formulas for area and circumference.
Also calculate:
For Rectangle: diagonal
For Circle: diameter
Write a function sumAreas(vararg shapes: Shape): Double that takes any number of shapes and returns the total area.
In the main() function, create:
A rectangle of width = 5, height = 7
A circle of radius = 5
Then print the total area of both shapes using sumAreas().*/

fun main(){
    val rect=Rectangle1(
        width =  5f,
        height = 7f,
    )
    println("Area of rectangle is:${rect.area}")
    println("Circumference is:${rect.circumference}")
    val cir=Circle(
       radius = 5f,

    )
    println("Area of circle is:${cir.area}")
    println("Circumference is:${cir.circumference}")
    println(sumarea(rect, cir))
    println(sumcircumference(rect,cir))
}
interface Shape{
    val area: Float
    val  circumference: Float
}
fun sumarea(vararg shapes: Shape): Double{
    val new=shapes.sumOf { it->
        it.area.toDouble()
    }
    return new
}
fun sumcircumference(vararg shapes: Shape): Double {
    val new1 = shapes.sumOf { it ->
        it.circumference.toDouble()
    }
    return new1
}
data class Rectangle1(val height: Float, val width:Float): Shape{
    override val area=height*width
    override val circumference=2*width+2*height

}
data class Circle(val radius:Float):Shape{
    override val area=radius*radius* PI.toFloat()
    override val circumference=2*radius*PI.toFloat()
}