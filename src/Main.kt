import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val calc = Calc()
    while(true) {
        try {
            println("Enter question type.")
            println("Types are: 1 = exponential to log, 2 = log to exponential, 3 = x^num=anothernum, 4 = num^x=anothernum")
            val type = readLine()?.toInt() ?: 1
            when(type) {
                1 -> println(calc.expoToLog())
                2 -> println(calc.logToExpo())
                3 -> println(calc.xSolverOne())
                4 -> println(calc.xSolverTwo())
                else -> throw NumberFormatException()
            }
        } catch(e: NumberFormatException) {
            println("break")
            exitProcess(194)
        }
    }
}