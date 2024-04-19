package command_pattern

class Receiver {
    fun doSomething(a: String){
        println("Receiver working on $a")
    }

    fun doSomethingElse(b: String){
        println("Receiver also working on $b")
    }
}