package labOne

fun calculateY(m: Int, x: Int, c: Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    var output: String

    for (counter in 0..100) {
        val equationOne = calculateY(mOne, counter, cOne)
        val equationTwo = calculateY(mTwo, counter, cTwo)

        // printing the current value of the pointer
        println("loop at $counter")
//        println(equationOne)
//        println(equationTwo)

        // print the current value of the pointer where the two values
        // of x of both lines are the same
        // i.e. the point of intersection
        if (equationOne == equationTwo) {
            output = "intersection at counter: $counter"
            println(output)
            break
        }

        // if they don't intersect, print
        if (counter == 100 && equationOne != equationTwo) {
            output = "Don't intersect"
            println(output)
        }

    }



}

fun main() {
    intersection(3, 5, 4, 2)
    println()
    println()
    intersection(2, 1, 3, 3)
    println()
    println()
    intersection(-2, 3, 3, -2)
}

