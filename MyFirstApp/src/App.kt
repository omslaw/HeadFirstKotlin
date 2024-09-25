fun main (args: Array<String>) {
    println("Pow!")

    var x = 3
    val name = "Cormoron"
    x = x * 10
    println("x is $x.")
    // this comment

    while (x > 20) {
        x = x - 1
        println(" x is now $x.")
    }
    println()
    println()

    for (i in 1..10) {
        x = x +1
        println(" x is now $x.")
    }

    println()
    println()

   if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
   }

    if (name.equals("Cormoron")) {
        println("$name Strike")
    }
}