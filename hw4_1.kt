package homework

fun main(args:Array<String>){
    for (i in 100..999)
        if (findSpecialNumbers(i))
            println(i)
}
fun findSpecialNumbers(a:Int):Boolean{
    if (reverse(a)<a)
        return false
    if (!isPrime(a))
        return false
    if (!isPrime(reverse(a)))
        return false
    if(!isPrime(a/10))
        return false
    if(!isPrime(a%100))
        return false
    if (!isPrime(reverse(a)/10))
        return false
    if (!isPrime(reverse(a)%100))
        return false
    return true
}
fun reverse(a:Int):Int{
    var num=a
    var rNum=0
    while(num!=0){
        rNum=rNum*10+num%10
        num/=10
    }
    return rNum
}
fun isPrime(a:Int):Boolean{
    if (a<= 1)
        return false
    if (a % 2 == 0)
        return a == 2
    if (a % 3 == 0)
        return a == 3
    if (a % 5 == 0)
        return a == 5
    if (a % 7 == 0)
        return a == 7
    var i = 11
    while (i * i <= a) {
        if (a % i == 0)
            return false
        i += 2
    }
    return true
}