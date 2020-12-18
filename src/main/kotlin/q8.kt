fun main(){
    println("enter the number to find the sum of its factorial:")
    var num = readLine()
    var fact = 1
    var sum = 0
    if(num != null){
        for(i in 1..num.toInt()){
            fact *= i
            sum = sum + fact
        }
    }
    println("the sum of the factorials is = $sum")
}