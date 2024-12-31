/*
--- Code Magnets Exercise  ----

expected outputs
ding ding ba-da-bing!
bang bang bang!
ding ding ba-da-bing!

-- Completed exercise correctly and ran correct first time 12/30
 */
class DrumKit (var hasTopHat: Boolean, var hasSnare: Boolean) {
    fun playTopHat() {
        if (hasTopHat) println ("ding ding ba-da-bing!")
    }

    fun playSnare() {
        if (hasSnare) println ("bang bang bang!")
    }
}

fun main(args: Array<String>) {
    val d = DrumKit(true, true)

    d.playTopHat()
    d.playSnare()

    d.hasSnare = false

    d.playTopHat()
    d.playSnare()
}

/*  Be The Compiler Exercise

Fix the below 2 scenarios


1.

class TapeDeck {      *** Should include hasRecorder param  (Per answer this was fine)
    var hasRecorder = false
    fun playTape() {
        println("Tape playing")
    }
    fun recordTape() {
        if (hasRecorder) {
            println ("Tape recording")
        }
    }
}

fun main(args: Array<String>) {
    ***** Doesn't include object creation like val t = TapeDeck (true)  -- (Correct but I don't need the true as
                                                                            i dont need the param, so the below will be
                                                                            needed after all
    t.hasRecorder = true  *** you might not need this if you add the param in the class and pass in false (this is fine the
                                                                                                            way they have it)
    t.playTape()
    t.recordTape()
}

2.

class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) {
            println ("DVD recording")
        }
    }
}
fun main(args: Array<String>) {
    val d = DVDPlayer(true)
    d.playDVD()    *** There's no playDVD function in class so  you would need to create it  (Correct answer)
    d.recordDVD()
}
 */

