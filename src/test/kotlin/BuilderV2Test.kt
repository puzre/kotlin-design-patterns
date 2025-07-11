import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.puzre.creational.builder.v2.builder.AquaticPlantBuilder
import org.puzre.creational.builder.v2.builder.TerrestrialPlantBuilder
import org.puzre.creational.builder.v2.component.PlantHabitat
import org.puzre.creational.builder.v2.director.PlantDirector
import org.puzre.creational.builder.v2.plant.AquaticPlant
import kotlin.test.assertEquals

class BuilderV2Test {

    @Test
    @DisplayName("Aquatic Plant Builder Test")
    fun aquaticPlantBuilderTest() {

        val plantDirector = PlantDirector()
        val aquaticPlantBuilder = AquaticPlantBuilder()

        plantDirector.constructLotusPlant(builder = aquaticPlantBuilder)

        val lotusPlant: AquaticPlant = aquaticPlantBuilder.getResult()

        println(lotusPlant.toString())

        val expectedHabitat: PlantHabitat = PlantHabitat.AQUATIC
        val actualHabitat: PlantHabitat? = lotusPlant.habitat

        assertEquals(expectedHabitat, actualHabitat)

    }

    @Test
    @DisplayName("Terrestrial Plant Builder Test")
    fun terrestrialPlantBuilderTest() {

        val plantDirector = PlantDirector()
        val terrestrialPlantBuilder = TerrestrialPlantBuilder()

        plantDirector.constructRosePlant(terrestrialPlantBuilder)

        val rosePlant = terrestrialPlantBuilder.getResult()

        println(rosePlant.toString())

        val expectedHabitat: PlantHabitat = PlantHabitat.TERRESTRIAL
        val actualHabitat: PlantHabitat? = rosePlant.habitat

        assertEquals(expectedHabitat, actualHabitat)

    }

}