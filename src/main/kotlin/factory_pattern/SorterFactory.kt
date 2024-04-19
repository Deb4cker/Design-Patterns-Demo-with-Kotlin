package factory_pattern

abstract class SorterFactory {

    abstract fun create() : Sorter

    fun sortArray(array: Array<Int>) : Array<Int>{
        val sorter = this.create();
        return sorter.sort(array);
    }

}