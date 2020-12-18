fun main(){
    println("enter the number(to find the sum of even numbers):")
    var len = readLine()
    var sumOfEven = 0
    if(len != null){
        for( i in 1..len.toInt()){
            if(i % 2 == 0){
                sumOfEven = sumOfEven + i
            }
        }
    }
    print("sum of even numbers = $sumOfEven")
}