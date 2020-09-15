import java.text.DecimalFormat

fun main(){

    var userAns = 0.00  // variable that will hold the user input
    var cost = 0.00  // variabe that will hold the total cost of the user's items

    println("Please enter the price of your items.")  // ask the user a question
    println("Enter 0.00 to end") // let's the user know how to stop putting more inputs
    do{
        userAns = readLine()!!.toDouble()    // ask the user to enter the amount of their bill
        if (userAns != 0.00){ // checks to see if the user input doesn't equal 0.00
            cost += userAns  // adds the user input to the cost variable to hold multiple inputs
        }
    }while (0.00 != userAns) // checks to see if user input doesn't equal 0.00

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