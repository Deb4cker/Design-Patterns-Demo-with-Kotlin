package factory_pattern

class OrderedSorter : Sorter{
    override fun sort(array: Array<Int>): Array<Int> {
        return array.sortedArray()
    }
}

class ReverseSorter : Sorter{
    override fun sort(array: Array<Int>): Array<Int> {
        return array.sortedArray().reversedArray()
    }

}