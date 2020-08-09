fun main() {

    while (true) {
        println("请输入第一个数字:")
        var num1Str = readLine()
        println("请输入第二个数字:")
        var num2Str = readLine()

        try {
            var num1 = num1Str!!.toInt()
            var num2 = num2Str!!.toInt()
            println("${num1} + ${num2} = ${num1 + num2}")
        } catch (e: Exception) {
            //捕获异常
            println("请输入数字噢")
        }
    }
}