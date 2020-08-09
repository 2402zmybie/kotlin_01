fun main() {

    var result1 = 获取圆的周长(半径 = 1f)
    println(result1)

    var result2 = 获取圆的周长2(直径 = 2f)
    println(result2)
}

fun 获取圆的周长(PI:Float = 3.1415926f, 半径:Float):Float {
    return 2*PI*半径
}


fun 获取圆的周长2(PI:Float = 3.1415926f, 直径:Float):Float {
    return PI*直径
}