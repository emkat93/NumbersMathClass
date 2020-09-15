import java.text.DecimalFormat

fun main(){

    println("Please enter the cost of bill.")  // ask the user a question

       var cost = readLine()!!.toDouble() // ask the user to enter the amount of their bill
        calculatedCost(cost) // carries the cost to the next function

}

fun calculatedCost(cost: Double) {  // the next function will calculate the tax and tip to figure out the total
    val tax = .025
    val tip = .175

    val twoDigits = DecimalFormat("###,###,###.00") // formats the cost

    var taxCost = ((cost * tax) + cost) // calculates the cost plus the tax
    var totalCost = ((taxCost * tip) + taxCost) // calculates the the total cost with tip
    var formatted = twoDigits.format(totalCost)  // formats the total cost

    println("Your total is $$formatted")  // prints the results 
}