fun main(){
    println("enter the height of your pyramid: ")
    var num = readLine()
    if (num != null) {
        for(i in 1..num.toInt()){
            for (j in 1..i){
                print("#")
            }
            print("\n")
        }
    }
}