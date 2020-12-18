fun main(){
    print("enter a number to check its divisibilty with 5 and 11:")
    val num1 = readLine()
    if(num1 != null){
        divisibleBy5or11(num1.toInt())
    }

}
fun  divisibleBy5or11(x: Int){
    if(x % 5 == 0 && x % 11 == 0){
        print("yes it is divisible ny not 5 and 11")
    }else{
        print("not divisible by both")
    }
}
