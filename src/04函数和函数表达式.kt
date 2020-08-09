fun main() {
    var result = add1(3,5)
    println(result)

    //定义函数表达式
    var i = {x:Int, y:Int -> x + y}
    var result2 = i(1,2)
    print(result2)


}


//定义一个只有一行代码的返回值函数
fun add1(y:Int, x:Int) = x + y