fun main(args: Array<String>) {

    // Sharpen your pencil Exercise

    //var x: Int = 65.2  // not an int BAD
    var isPunk = true //should be caps?
    //var message = 'Hello' // should be char single ' not double for string "
    var y = 7 // its int

    // ones that dont work
    // b = smallNum // wont work since b is byte and smallnum was a short
    // isPunk = "false" // wont work since this should be boolean not string
    // var k = y.toDouble()  // y is 57 int
    // b = k.toByte() // byte is good up to 127 so should be fine

    // Other chap exercises

    var myArray = arrayOf(1, 2, 3)
    println(myArray[0])
    println(myArray.size)

    // string expressions
    var x = 42
    var value = "Value of x is $x"

    //var myArray = arrayOf(1, 2, 3)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"

    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
    // update array and has to be right type
    myArray[1] = 15
    println(myArray[1])

    // explicitly define array type
    var myArray2: Array<Byte> = arrayOf(1, 2, 3)

    // val (can never be changed so points to same array)
    // and var (can be changed) arrays
    var myArray3 = arrayOf(1,2,3)
    myArray3 = arrayOf(4, 5)
    // you can do this if val array
    // but you can still update values like myArray[2] = 6

    // Be the compiler exercises

    /***
     * Exercise --- Be the Compiler
     *
     * A:
     * Loop is longer than array and used in value for array so probably index out of bounds exception
     * for loop length use .size for array
     *
     * (answer from book: either loop to 4 or change to (size - 1)
     *
     * B:
     *
     * for loop length use .size array
     *
     * (answer from book: missed the curly braces for array location
     *
      */

    // Code Magnets exercise
    /**
     * Order of code snippets:
     *
     * val fruit = ....
     * val index ....
     *
     * var x ...
     * var y ...
     *
     * while ....
     * y = index....
     * println....
     * x = x + 1
     * }
     *  (answer from book:  i got it correct)
     */

    /** Mixed reference exercise
     *
     * x = (0, 1, 2, 3, 4)
     *
     * x3 = now 2  (0,1,2,2,4)
     * x4 = 0  (0, 1,2,2,0)
     * x2 = 1  (0 1 1 2 0)
     * x1 = 0  (0 0 1 2 0)
     * x0 = 0  (0 0 1 2 0)
     * x4 = 2  (0 0 1 2 2)
     * x3 = 1  (0 0 1 1 2)
     * x2 = 2  (0 0 2 1 2)
     *
     * my answers
     * x[0] = 0
     * x[1] = 0
     * x[2] = 2
     * x[3] = 1
     * x[4] = 2
     *
     * (answer from book: i got it correct)
     *
     */
}