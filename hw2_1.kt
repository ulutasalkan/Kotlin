package homework

fun main(args:Array<String>){
    showStars(6)
}
fun showStars(value:Int){
    var v1=value-1
    do{
        for(i in 1..v1)
            print(" ")
        for(i in 1..value-v1)
            print("*")
        for(i in 1..value-v1-1)
            print("*")
        println()
    }while(v1-->0)
    //simetrisini alma
    v1=value-1
    do{
        for(i in 1..value-v1)
            print(" ")
        for(i in 1..(2*v1)-1)
            print("*")
        println()
    }while(v1-->0)
}