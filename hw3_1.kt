package homework

fun main(args:Array<String>){
    findPrimeMultipliers(65)
}
fun findPrimeMultipliers(num:Int){
    var value=Math.abs(num)
    if(value==0||value==1)
        println("It has not prime multiplier")
    for(i in 2..a/2){
            while(num%i==0){
                num=num/i
                print(i.toString()+" ")
            }
        }
}
