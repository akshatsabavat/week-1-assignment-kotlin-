fun main(){
    print("enter 3 numbers to find the max out of them ")
    print("\nenter first number: ")
    val num1 =  readLine()
    print("enter second number: ")
    val num2 =  readLine()
    print("enter third number: ")
    val num3 =  readLine()
    if (num1 != null && num2 != null && num3 != null) {
        maxOutOfThree(num1.toInt(),num2.toInt(),num3.toInt())
    }
}


fun maxOutOfThree(x: Int,y: Int,z: Int){
    if(x > y && x > z){
        print("the maximum number is $x")
    }
    else if(y > x && y > z){
        print("the maximum number is $y")
    }
    else{
        print("the maximum number is $z")
    }
}
