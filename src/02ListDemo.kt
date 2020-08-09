fun main() {

    //集合带索引的遍历
    var lists = listOf("买鸡蛋","买面包","买大米")
    for ((i,e) in lists.withIndex()) {
        print("$i $e \n")
    }
}