package org.puzre.creational.builder.v2.plant

import org.puzre.creational.builder.v2.component.PlantHabitat
import org.puzre.creational.builder.v2.component.PlantLeaf
import org.puzre.creational.builder.v2.component.PlantName
import org.puzre.creational.builder.v2.component.PlantRoot
import org.puzre.creational.builder.v2.component.PlantStem
import org.puzre.creational.builder.v2.component.PlantWaterSource

data class TerrestrialPlant(
    val name: PlantName? = null,
    val root: PlantRoot? = null,
    val stem: PlantStem? = null,
    val leaf: PlantLeaf? = null,
    val waterSource: PlantWaterSource? = null,
    val habitat: PlantHabitat? = null
) {

    override fun toString(): String {
        return "🌱 Terrestrial Plant\n" +
                "Name: ${name ?: "Unknown"}\n" +
                "Root: ${root ?: "Unknown"}\n" +
                "Stem: ${stem ?: "Unknown"}\n" +
                "Leaf: ${leaf ?: "Unknown"}\n" +
                "Water Source: ${waterSource ?: "Unknown"}\n" +
                "Habitat: $habitat"
    }

}
