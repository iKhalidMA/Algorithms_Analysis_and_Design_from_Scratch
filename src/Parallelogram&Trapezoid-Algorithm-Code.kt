fun main() {
    /*
--  Calculate Area of Parallelogram:-
       Inputs: b and h
       Processes: Area = b × h
       Outputs: Area

       Steps:-
        1- read the base and the high
        2- multiply the base and the high
        3- Print The Area
        */
    println("Exercise 1 - Parallelogram\n___-___ ")
    print("Enter a base number: ")
    var b: Int = readln()!!.toInt();
    print("Enter a high number: ")
    var h: Int = readln()!!.toInt();
    print("The Area of Parallelogram equals "+Parallelogram(b,h)+"\n \n")


    /*
--  Calculate Area of Trapezoid:-
       Inputs: longBase, shortBase, altitude
       Processes: Area = 1/2 ( longBase + shortBase) * altitude
       Outputs: Area

       Steps:-
        1- read the long_base and the short_base and the altitude
        2- summation longBase and shortBase then divided by 2 , then multiply by altitude
        3- Print The Area
      */


    println("Exercise 1 - Trapezoid\n___-___")
    print("Enter the sort base: ")
    var shortBase: Int= readln()!!.toInt()
    print("Enter the Long base: ")
    var longBase: Int = readln()!!.toInt()
    print("Enter the hight of the trapezoid : ")
    var altitude: Int = readln()!!.toInt()
    println( "The Area of trapezoid is equal: "+ Trapezoid(shortBase,longBase,altitude))
}

fun Parallelogram (h: Int,b:  Int):Int{
    var Area = b * h ;
    return Area
}

fun Trapezoid(a: Int, b: Int , h: Int ): Double {
    var Area =  0.5 * (a+b)
    Area = Area * h
    return Area
}
