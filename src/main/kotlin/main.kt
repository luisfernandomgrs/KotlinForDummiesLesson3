fun main(args: Array<String>) {
    conditional_When()
}

fun conditional_When() {
    var option = 10

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
            println("Select new option...")
        }
    }
}