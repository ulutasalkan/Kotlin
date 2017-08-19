package homework

fun main(args:Array<String>){
    findPrimeMultipliers(65)
}
fun findPrimeMultipliers(num:Int){
    var value=num
    if(value==0||value==1)
        println("It has not prime multiplier")
    for(i in 2..value/2){
        while(true){
            if(value%i==0){
                print("$i ")
                value/=i
            }
            else break
        }
    }
}