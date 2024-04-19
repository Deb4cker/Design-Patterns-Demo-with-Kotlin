package strategy_pattern

fun interface SortStrategy {
    fun sort(array: Array<Int>): Array<Int>
}

class OrderedSortStrategy : SortStrategy{
    override fun sort(array: Array<Int>): Array<Int> {
        return array.sortedArray()
    }
}

class ReverseSortStrategy : SortStrategy{
    override fun sort(array: Array<Int>): Array<Int> {
        return array.sortedArray().reversedArray()
    }
}
