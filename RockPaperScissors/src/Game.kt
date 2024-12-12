fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice (optionsParam: Array<String>) =
    optionsParam [(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    // Ask the user for their choice
    print("Please enter one of the following:")
    for (item in optionsParam) print(" $item")
    println(".")
    // Read the user input
    val userInput = readLine()

}

