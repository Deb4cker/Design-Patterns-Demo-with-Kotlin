package singleton_pattern

fun response(name: String): String{
    return "${name}: Hi, I'm the ${name}, Singleton. I'm, doing something"
}

//with object
object ObjectSingleton {
    fun doSomething() : String{
        return response("Object Singleton")
    }
}

//With class
class ClassSingleton{
    companion object{
        fun doSomething() : String{
            return response("Class Singleton")
        }
    }
}

//Lazy Initialization:
// If your Singleton needs some heavy initialization,
// you might want to use lazy initialization to avoid
// doing this work until it’s actually needed.
//
class HeavySingleton private constructor(){
    companion object{
        val instance : HeavySingleton by lazy {
            val heavySingleton = HeavySingleton()
            heavySingleton
        }
    }

    fun doSomething() : String{
        return response("Heavy Singleton")
    }
}

//Double-Checked Locking:
//If your Singleton is used from multiple threads
//nd you need to ensure that only one thread
//can initialize the Singleton,
//you can use the double-checked locking pattern.

class ThreadSafeSingleton private constructor(){
    companion object{
        @Volatile private var instance : ThreadSafeSingleton? = null
        fun getInstance(): ThreadSafeSingleton = instance ?: synchronized(this){
            instance ?: ThreadSafeSingleton().also {
                run { instance = it }
            }
        }

    }

    fun doSomething() : String{
        return response("Thread Safe Singleton")
    }
}
