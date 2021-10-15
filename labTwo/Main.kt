package labTwo

import java.lang.NumberFormatException
import kotlin.math.abs

var funds : Double = 100.0
val pswd = "password"

fun balance() {
    println("Your $funds")
}

fun deposit(depositAmount: Double) {
    funds += abs(depositAmount)
    println("Deposit was successful")
}

fun withdraw(withdrawalAmount: Double) {
    print("Please enter your password: ")
    var passwordInput = readLine()!!

    if (passwordInput == pswd ) {
        if (withdrawalAmount <= funds) {
            funds -= abs(withdrawalAmount)
            println("Withdrawal successful")
        } else {
            println("Cannot withdraw more than you have in your funds")
        }

    } else {
        println("Incorrect Password! Please try again")
    }
}

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")

        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> try {
                deposit(cmd[1].toDouble())
            } catch (e: IndexOutOfBoundsException) {
                println("No amount entered. Please enter a valid amount")
            } catch (e: NumberFormatException) {
                println("The amount should be a number. Please enter a valid amount")
            }
            "withdraw" -> try {
                withdraw(cmd[1].toDouble())
            } catch (e: IndexOutOfBoundsException) {
                println("No amount entered. Please enter a valid amount")
            } catch (e: NumberFormatException) {
                println("The amount should be a number. Please enter a valid amount")
            }
            // Each command goes here...
            else -> println("Invalid command")
        }
    }
}