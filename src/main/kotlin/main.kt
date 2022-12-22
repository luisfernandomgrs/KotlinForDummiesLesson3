fun main(args: Array<String>) {
    conditional_When()
    conditional_When_with_attribution()
}

fun conditional_When() {
    var option = 10

    println("Simple Conditional When")

    when (option) {
        1 -> println("Option select, One")
        2 -> println("Option select, Two")
        3 -> println("Option select, Three")
        4 -> println("Option select, Four")
        5 -> println("Option select, Five")
        6 -> println("Option select, Six")
        7 -> println("Option select, Seven")
        8 -> println("Option select, Eight")
        9 -> println("Option select, Nine")
        else -> {
            println("Unknown option")
            println("Select new option...\n")

        }
    }
}

fun conditional_When_with_attribution() {
    var option = 10

    println("Conditional When, with attribution")

    var message = when (option) {
        1 -> "Option select, One"
        2 -> "Option select, Two"
        3 -> "Option select, Three"
        4 -> "Option select, Four"
        5 -> "Option select, Five"
        6 -> "Option select, Six"
        7 -> "Option select, Seven"
        8 -> "Option select, Eight"
        9 -> "Option select, Nine"
        else -> "Unknown option"
    }

    println(message)
}