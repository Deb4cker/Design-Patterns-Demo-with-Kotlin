package observer_pattern

class Radio : Observer{

    override fun notify(program: String) {
        println("I am a radio receiving the signal! the program is $program")
    }

}

class Television : Observer{
    override fun notify(program: String) {
        println("I am a television receiving the signal! The program is $program")
    }
}