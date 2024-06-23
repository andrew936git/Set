//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println("=============================1===========================")
    val numbers = setOf(2, 7, 9, 0, 3, 1, 5, 4, 6, 8)
    val evenNumbers: MutableSet<Int> = mutableSetOf()
    val oddNumbers: MutableSet<Int> = mutableSetOf()
    for (i in numbers) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        } else {
            oddNumbers.add(i)
        }
    }
    println(evenNumbers)
    println(oddNumbers)
    println("=============================2===========================")
//2
    val newSet: MutableSet<Int> = mutableSetOf()
    for (i in numbers) {
        if ((i * 2) % 5 == 0) newSet.add(i * 2)
    }
    println(newSet)
//3
    println("=============================3===========================")
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val set: Set<String> = setOf("Арбуз", "Абрикос", "Дыня", "Арбуз", "Абрикос", "Дыня")

    println(removeDuplicates(set))
//4
    println("=============================4===========================")
    val array = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0 )
    for (i in array.indices){
        if (array[i] == 0){
            var j = i
            for (j in i..array.size-1){
                if (array[j] == 0){
                    continue
                }
                else{
                    var buf = array[i]
                    array[i] = array[j]
                    array[j] = buf
                    break
                }
            }
        }
    }
    array.forEach { i -> print("$i ") }
}

fun <T> removeDuplicates(collection: Collection<T>?): MutableSet<T> {
    val set: MutableSet<T> = mutableSetOf()
    if (collection != null) {
        set.addAll(collection)
    }
    return set
}