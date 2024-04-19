package builder_pattern

interface HouseBuilder {
    fun reset()
    fun buildRoof()
    fun buildWalls()
    fun build(): House
}

class RegularHouseBuilder() : HouseBuilder{

    private lateinit var house: House

    init {
        reset()
        buildRoof()
        buildWalls()
    }

    override fun build(): House{
        return house
    }

    override fun reset() {
        this.house = House()
    }

    override fun buildRoof() {
        house.addPart("regular roof")
    }

    override fun buildWalls() {
        house.addPart("regular wall")
    }
}

class MansionBuilder() : HouseBuilder{

    private lateinit var house: House

    init {
        reset()
        buildRoof()
        buildPool()
        buildWalls()
        buildGarden()
    }

    override fun build(): House{
        return house
    }

    override fun reset() {
        this.house = House()
    }

    override fun buildRoof() {
        house.addPart("Schingler roof")
    }

    override fun buildWalls() {
        house.addPart("Beautiful rock walls")
    }

    fun buildPool(){
        house.addPart("Pool")
    }

    fun buildGarden(){
        house.addPart("Garden")
    }

}

