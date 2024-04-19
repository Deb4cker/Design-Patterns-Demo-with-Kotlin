package observer_pattern

class Transmissor {

   private val watchers : MutableList<Observer> = mutableListOf()

    fun addObserver(observer: Observer) {
        watchers.add(observer)
    }

    fun notifyObservers(program : String) {
        for (observer in watchers) {
            observer.notify(program)
        }
    }
}