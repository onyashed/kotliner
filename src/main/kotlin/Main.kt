package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")
    val customers = 10
    println("There are $customers customers")
// There are 10 customers

    println("There are ${customers + 1} customers")
// There are 11 customers


        val name_client = "Mary"
        val age = 20
        println("$name_client is $age years old")


// Some customers leave the queue
    var customers_cli = 8

    customers_cli = customers_cli + 3 // Example of addition: 11
    customers_cli += 7            // Example of addition: 18
    customers_cli -= 3            // Example of subtraction: 15
    customers_cli *= 2            // Example of multiplication: 30
    customers_cli /= 3            // Example of division: 10

    println(customers_cli) // 10
    //Integers
    val year: Int = 2020
    val score: UInt = 100u
    val currentTemp: Float = 24.5f
    val price: Double = 19.99
    val separator: Char = ','
    val message: String = "Hello, world!"
    // Variable declared without initialization
    val d: Int
// Variable initialized
    d = 3

// Variable explicitly typed and initialized
    val e: String = "hello"
    //Collections
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
// [triangle, square, circle]

// Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)
// [triangle, square, circle]
    //Casting
    val shapes_mut: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes_mut
    //first last cont
    println("This list has ${readOnlyShapes.first()} item")
    println("This list has ${readOnlyShapes.last()} item")
    println("This list has ${readOnlyShapes.count()} items")
// This list has 3 items
    //check prescence

    println("circle" in readOnlyShapes)
// true
//Amend a mutable list
// Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)
// [triangle, square, circle, pentagon]

// Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)
// [triangle, square, circle]
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    //Extra cherry is dropped
// Mutable set with explicit type declaration
    //Sets are unordered.You can't get an item at an index
    println("This set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit)
// true
    //Only confirm with th in key word to confirm an item exists.

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitLocked: Set<String> = fruit
    //Add and remove items in a set
    fruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruit)              // [apple, banana, cherry, dragonfruit]

    fruit.remove("dragonfruit") // Remove "dragonfruit" from the set
    println(fruit)
    //Assign mutableset to set to prenvent modification.
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}
    //key value pairs.
    //Manipulating a mutable map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "pineapple" to 120)
    juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu)
    juiceMenu.remove("orange")    // Remove key "orange" from the map
    println(juiceMenu)

    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
// This map has 3 key-value pairs
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}