package builder_pattern

class House {
    private var structure: MutableList<String> = mutableListOf()

    fun addPart(part: String){
        structure.add(part)
    }

    fun getParts(): String{
        return structure.joinToString (separator = ",")
    }
}