package command_pattern

fun interface Command {
    fun execute()
}

class SimpleCommand(
    private val payload: String
    ): Command{
        override fun execute() {
            println("Just a simple command that receives a payload. The Payload is: $payload")
        }
}

class ComplexCommand(
    private val receiver: Receiver,
    private val a: String, private val b:String
    ): Command {

    override fun execute() {
        println("Receiver working: ")
        receiver.doSomething(a)
        receiver.doSomething(b)
    }


}