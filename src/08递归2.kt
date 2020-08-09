fun main() {
    var result = 0
    println(ollAdd(100000,result))
}

tailrec fun ollAdd(num:Int,result:Int):Int {
    println("计算机进行第${num}次运算,result=${result}")
    if(num == 0) {
        return 1
    }else {
        return ollAdd(num -1,result + num);
    }
}