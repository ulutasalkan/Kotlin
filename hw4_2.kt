package homework

fun main(args:Array<String>){
    for (i in 0..999)
        if(isPrimeX(i))
            println(i)
}
fun isPrimeX(a:Int):Boolean{
    var num=a
    if (!isPrime(num))
        return false
    while (num>9){
        if (!isPrime(num))
            return false
        if (!isPrime(sumDigits(num)))
            return false
        num= sumDigits(num)
    }
    return true
}
fun sumDigits(a:Int):Int{
    var num=a
    var sum=0
    while(num!=0){
        sum+=num%10
        num/=10
    }
    return sum
}