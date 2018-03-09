import kotlin.math.truncate

class Calc {
    fun expoToLog(): String {
        print("Enter base: ")
        val base = readLine()?.toIntOrNull()
        print("Enter exponent: ")
        val expo = readLine()?.toIntOrNull()
        print("Enter =: ")
        val equals = readLine()?.toIntOrNull()
        return "log$base $equals = $expo"
    }
    fun logToExpo(): String {
        print("Enter first num: ")
        val first = readLine()?.toIntOrNull()
        print("Enter next num: ")
        val second = readLine()?.toIntOrNull()
        print("Enter =: ")
        val equals = readLine()?.toIntOrNull()
        return "$first^$equals = $second"
    }
    fun xSolverOne(): Float {
        print("Enter exponent: ")
        val expo = readLine()?.toFloat() ?: 1
        print("Enter =: ")
        val equals = readLine()?.toFloat() ?: 1
        val returner = equals.toString().toDouble()
        return Math.pow(returner, (1.0 / expo.toString().toDouble())).toFloat()
    }
    fun xSolverTwo(): Float {
        print("Enter first num: ")
        val first: Float = readLine()?.toFloat() ?: 1F
        print("Enter second num: ")
        val second: Float = readLine()?.toFloat() ?: 1F //Wish I knew why I had to explicitly declare types to get that if statement to work
        //Sorting to ensure smaller / bigger occurs
        val bigger: Float
        val smaller: Float
        if(first > second) {
            bigger = first
            smaller = second
        } else {
            bigger = second
            smaller = first
        }
        //Performs division
        return divide(bigger, smaller)
    }
    private fun divide(num1: Float, num2: Float): Float {
        var returner: Float = 0F
        var thing: Float = num1 / num2
        if(thing < num2) {
            returner = truncate(thing)
            thing /= num2
            returner += thing
            return returner
        } else {
            return divide(thing, num2)
        }
    }
}