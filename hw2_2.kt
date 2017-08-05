package homework

fun main(args:Array<String>){
    displayDuration(13)
}
fun displayDuration(value:Long){
    var hour:Int
    var minute:Int
    var second:Int
    hour=(value/3600).toInt()
    minute=(value%3600).toInt()/60
    second=(value%3600).toInt()%60
    var hourS:String
    var minuteS:String
    var secondS:String
    if(hour==0) hourS="" else hourS="$hour hours "
    if(minute==0) minuteS="" else minuteS="$minute minutes "
    if(second==0) secondS="" else secondS="$second seconds"
    println(hourS+minuteS+secondS)
}