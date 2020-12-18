fun main(){
print("enter a letter or a number to check: ")
    val userInput = readLine()
if( userInput != null) {
    if (userInput >= 'a'.toString() && userInput <= 'z'.toString() || userInput >= 'A'.toString() && userInput <= 'Z'.toString()) {
        println("The user input is an alphabet.")
    } else {
        println("The user input is not an alphabet.")
    }
}
}