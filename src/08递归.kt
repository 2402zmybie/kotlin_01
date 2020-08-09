//演示递归
//阶乘

fun main() {
    println(fac(5))
}


fun fac(num:Int):Int {
    if(num == 1) {
        return 1
    }else {
        return num * fac(num -1)
    }
}
