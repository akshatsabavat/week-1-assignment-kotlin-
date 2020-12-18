fun main(){
    val number = 153
    var num: Int
    var remin: Int
    var result = 0

    num = number

    while (num != 0) {
        remin = num % 10
        result += Math.pow(remin.toDouble(), 3.0).toInt()
        num /= 10
    }

    if (result == number) {
        println("yes $number is an Armstrong number.")
    }
    else {
        println("no $number is not an Armstrong number.")
    }
}
