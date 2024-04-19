import builder_pattern.HouseBuilder
import builder_pattern.MansionBuilder
import builder_pattern.RegularHouseBuilder
import command_pattern.ComplexCommand
import command_pattern.Invoker
import command_pattern.Receiver
import command_pattern.SimpleCommand
import factory_pattern.*
import observer_pattern.Observer
import observer_pattern.Radio
import observer_pattern.Television
import observer_pattern.Transmissor
import singleton_pattern.ClassSingleton
import singleton_pattern.HeavySingleton
import singleton_pattern.ObjectSingleton
import singleton_pattern.ThreadSafeSingleton
import strategy_pattern.OrderedSortStrategy
import strategy_pattern.ReverseSortStrategy
import strategy_pattern.SortStrategy
import strategy_pattern.SorterStrategist

fun main() {
    factoryPatternExecution()
    singletonPatternExecution()
    strategyPatternExecution()
    commandPatternExecutor()
    builderPatternExecutor()
    observerPatternExecutor()
}

fun strategyPatternExecution() {
    var sortStrategy : SortStrategy = OrderedSortStrategy()
    val sorter = SorterStrategist(sortStrategy)

    val array = arrayOf(3, 2, 8 ,7, 9, 1)

    sorter.send(array)

    sortStrategy = ReverseSortStrategy()
    sorter.setStrategy(sortStrategy)

    sorter.send(array)
}

fun singletonPatternExecution() {
    val objectSingleton = ObjectSingleton.doSomething()
    val classSingleton = ClassSingleton.doSomething()
    val heavySingleton= HeavySingleton.instance.doSomething()
    val threadSafeSingleton = ThreadSafeSingleton.getInstance().doSomething()

    println(objectSingleton)
    println(classSingleton)
    println(heavySingleton)
    println(threadSafeSingleton)
}

fun factoryPatternExecution(){

    val array = arrayOf(3, 2, 8 ,7, 9, 1)
    var sorterFactory : SorterFactory = OrderedSorterFactory()

    val orderedArray = sorterFactory.sortArray(array)
    sorterFactory = ReverseSorterFactory()
    val reverseOrderedArray = sorterFactory.sortArray(array)

    println(orderedArray.contentToString())
    println(reverseOrderedArray.contentToString())
}

fun commandPatternExecutor(){
    val invoker = Invoker()
    invoker.setOnStart(SimpleCommand("Say Hi"))
    val receiver = Receiver()
    invoker.setOnFinish(ComplexCommand(receiver, "a", "b"))
    invoker.doTheBusinessLogic()
}

fun builderPatternExecutor(){
    var builder: HouseBuilder = RegularHouseBuilder()
    val regularHouse = builder.build()
    builder = MansionBuilder()
    val mansion = builder.build()

    println(regularHouse.getParts())
    println(mansion.getParts())
}

fun observerPatternExecutor(){
    val programs = arrayOf("Zorra Total", "A Grande Família", "Family Guy", "Sabadou com Virginia")
    val observers: Array<Observer> = arrayOf(Television(), Radio(), Radio(), Television(), Television())
    val transmissor = Transmissor()

    for(observer in observers) transmissor.addObserver(observer)

    for(program in programs) transmissor.notifyObservers(program)
}