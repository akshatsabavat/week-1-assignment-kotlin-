fun main(){
    print("enter a number to check if its positive or negative:")
    val num =  readLine()
    if (num != null) {
        negg_or_pos(num.toInt())
    }

}
fun negg_or_pos(x: Int){
    if(x > 0){
        print("positive")
    }
    else if(x < 0)
    {
        print("negative")
    }
    else{
        print("enter non zero number ")
    }
}



