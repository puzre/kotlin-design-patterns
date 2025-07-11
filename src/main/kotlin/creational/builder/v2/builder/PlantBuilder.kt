package org.puzre.creational.builder.v2.builder

import org.puzre.creational.builder.v2.component.PlantHabitat
import org.puzre.creational.builder.v2.component.PlantLeaf
import org.puzre.creational.builder.v2.component.PlantName
import org.puzre.creational.builder.v2.component.PlantRoot
import org.puzre.creational.builder.v2.component.PlantStem
import org.puzre.creational.builder.v2.component.PlantWaterSource

interface PlantBuilder {

    fun name(name: PlantName)
    fun root(root: PlantRoot)
    fun stem(stem: PlantStem)
    fun leaf(leaf: PlantLeaf)
    fun waterSource(waterSource: PlantWaterSource)
    fun habitat(habitat: PlantHabitat)

}