fun main(){
    println("enter a number to find its factorial:")
    var num = readLine()
    var fact = 1
    if (num != null) {
        for(i in 1..num.toInt()){
            fact *= i
        }

    }
    println("factorial = $fact")
}