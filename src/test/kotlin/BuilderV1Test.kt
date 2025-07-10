import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.puzre.creational.builder.v1.Plant
import org.junit.jupiter.api.Assertions.*
import org.puzre.creational.builder.v1.House

class BuilderV1Test {

    @Test
    @DisplayName("Plant Builder Test")
    fun plantBuilderTest() {

        val plant: Plant = Plant.builder()
            .fruits(2)
            .nodes(3)
            .leafs(1)
            .color("Green")
            .build()

        val expectedColor = "Green"
        val actualColor: String? = plant.color

        assertEquals(expectedColor, actualColor)

    }

    @Test
    @DisplayName("House Builder Test")
    fun houseBuilderTest() {

        val house: House = House.builder()
            .doors(2)
            .windows(2)
            .color("Blue")
            .build()

        val expectedColor = "Blue"
        val actualColor: String? = house.color

        assertEquals(expectedColor, actualColor)

    }

}