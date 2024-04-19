package factory_pattern

class OrderedSorterFactory : SorterFactory(){
    override fun create(): Sorter {
        return OrderedSorter()
    }
}

class ReverseSorterFactory : SorterFactory() {
    override fun create() : Sorter {
        return ReverseSorter()
    }
}

