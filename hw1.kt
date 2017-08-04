package homework

fun main(args:Array<String>){
    signum(1)
    signum(0)
    signum(-1)
}
fun orderNumbers(v1:Int,v2:Int,v3:Int ){
    if(v1>v2)
        if(v1>v3)
            if(v2>v3)
            println("$v1>$v2>$v3")
            else
                if(v2==v3)
                    println("$v1>$v3=$v2")
                else
                    println("$v1>$v3>$v2")
        else
            if (v3>v1)
                println("$v3>$v1>$v2")
            else
                println("$v3=$v1>$v2")
    else if(v2>v1)
            if(v2>v3)
                if(v1>v3)
                    println("$v2>$v1>$v3")
                else
                println("$v2>$v3>$v1")
            else
                if(v2==v3)
                    println("$v3=$v2>$v1")
                else
                    println("$v3>$v2>$v1")
    else
        if(v3>v1)
            println("$v3>$v2=$v1")
        else
            if(v3<v1)
                println("$v2=$v1>$v3")
            else
                println("$v2=$v3=$v1")
}
fun orderNumbers2(v1:Int,v2:Int,v3:Int){
    if(v1==v2 || v2==v3|| v1==v3){
        findEquals(v1, v2, v3)
        return
    }
    var max=findMax(v1,v2,v3)
    var min:Int
    var mid:Int
    if(max==v3){
        mid= findMax(v1,v2)
        min= findMin(v1,v2)
    }
    else if(max==v2){
        mid= findMax(v1,v3)
        min= findMin(v1,v3)
    }
    else{
        mid= findMax(v2,v3)
        min= findMin(v2,v3)
    }
    println("$max>$mid>$min")
}
fun findMax(v1:Int,v2:Int):Int=if(v1>v2) v1 else v2
fun findMax(v1:Int,v2:Int,v3:Int):Int=findMax(findMax(v1,v2),v3)
fun findMin(v1:Int,v2:Int):Int=if(v1>v2) v2 else v1
fun findEquals(v1:Int,v2:Int,v3:Int){
    var max:Int
    if(v1==v2 && v2==v3)
        println("$v1=$v1=$v1")
    if(v1==v2 &&v2!=v3){
        max=findMax(v1,v3)
        if(max==v1)
            println("$v1=$v1>$v3")
        else
            println("$v3>$v1=$v1")
    }
    if(v1!=v2 &&v2==v3){
        max=findMax(v1,v3)
        if(max==v1)
            println("$v1>$v3=$v3")
        else
            println("$v3=$v3>$v1")
    }

}
fun findMid(v1:Int,v2:Int,v3:Int):Int{
    if(v1==v2 || v2==v3) return findMin(v1,v3)
    if(v1==v3) return findMin(v1,v2)
    var max= findMax(v1, v2, v3)
    if(max==v1) return findMax(v2,v3)
    else if(max==v2) return findMax(v1,v3)
    else return findMax(v1,v2)
}
fun signum(v1:Int){
    if(v1>0) println("Positive")
    else if(v1==0) println("Zero")
    else println("Negative")
}
