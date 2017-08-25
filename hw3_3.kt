package aulutas

/**
 * Created by aulutas on 25.08.2017.
 */
fun main(args:Array<String>) {
    var m=Maths()
    m.goldBachTheorem(36)
}

fun goldBachTheorem(a:Int){
    var num=a
    if(num%2!=0 || num<=2){
        println("Wrong number entry")
        return
    }
    for (i in 2..num)
        if (isPrime(i)&&isPrime(num-i)){
            println("$i + ${num-i} = $num")
            break
        }
}
fun isPrime(a:Int):Boolean{
    var num=a
    var count=0
    if (num<2)
        return false
    if(num%2==0)
        return num==2
    if(num%3==0)
        return num==3
    if(num%5==0)
        return num==5
    if(num%7==0)
        return num==7
    for(i in 11..num/2)
        if(num%i==0)
            count++
    if(count>1)
        return false
    return true
}