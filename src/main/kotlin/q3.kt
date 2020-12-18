fun main(){
    print("enter a number to find its absolute value = ")
    val num = readLine()
    var abs = 1
    if (num != null) {
        if(num.toInt() < 0 ){
            abs = num.toInt()*(-1)
            print("absolute value = $abs")
        }else{
            abs = num.toInt()
            print("absolute value = $abs")
        }

    }
}