fun main(){
    print("enter the lenghts of the sides of a triangle:")
    print("\nenter the lenght of the first side: ")
    val len1 =  readLine()
    print("enter the lenght of the second side: ")
    val num2 =  readLine()
    print("enter the lenght of the third side: ")
    val num3 =  readLine()
    if (len1 != null && num2 != null && num3 != null) {
        triangleSidesAndType(len1.toInt(),num2.toInt(),num3.toInt())
    }
}
fun triangleSidesAndType(len1: Int,len2: Int,len3: Int){
    if((len1 == len2 && len1 != len3 && len2 != len3) || (len2 == len3 && len2 != len1 && len3 != len1) || (len1 == len3 && len1 != len2 && len3 != len2)){
        print("isosceles triangle")
    }else if(len1 == len2 && len2 == len3 && len1 == len3){
        print("equilateral triangle")
    }else if(len1 != len2 && len2 != len3 && len1 != len3){
        print("scalene triangle")
    }
}