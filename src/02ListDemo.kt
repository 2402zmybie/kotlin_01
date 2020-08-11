fun main() {

    //集合带索引的遍历
    var lists = listOf("买鸡蛋","买面包","买大米")
    for ((i,e) in lists.withIndex()) {
        print("$i $e \n")
    }

    println("-------------")

    //遍历一个不包含末尾元素的区间
    for(index in 0 until lists.size) {
        println("${index}----${lists[index]}")
    }
}