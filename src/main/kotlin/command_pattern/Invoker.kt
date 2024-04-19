package command_pattern

class Invoker {

    private lateinit var onStart: Command
    private lateinit var onFinish: Command

    fun setOnStart(command: Command){
        onStart = command
    }

    fun setOnFinish(command: Command){
        onFinish = command
    }

    fun doTheBusinessLogic(){
        println("Invoker: Does anybody want something before I start?")
        this.onStart.execute()

        println("I'm doing something very important.")

        println("Does anybody wants something before I finish")
        this.onFinish.execute()
    }
}