package strategy_pattern

class SorterStrategist(private var strategy: SortStrategy){

    fun setStrategy(strategy: SortStrategy){
        this.strategy = strategy
    }

    fun send(array: Array<Int>){
        val sortedArray = strategy.sort(array)
        println(sortedArray.contentToString())
    }
}