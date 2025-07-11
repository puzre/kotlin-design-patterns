package org.puzre.creational.builder.v2.director

import org.puzre.creational.builder.v2.builder.PlantBuilder
import org.puzre.creational.builder.v2.component.PlantHabitat
import org.puzre.creational.builder.v2.component.PlantLeaf
import org.puzre.creational.builder.v2.component.PlantName
import org.puzre.creational.builder.v2.component.PlantRoot
import org.puzre.creational.builder.v2.component.PlantStem
import org.puzre.creational.builder.v2.component.PlantWaterSource

class PlantDirector {

    fun constructRosePlant(builder: PlantBuilder) {
        builder.name(name = PlantName.ROSE)
        builder.root(root = PlantRoot.STRONG)
        builder.stem(stem = PlantStem.THICK)
        builder.leaf(leaf = PlantLeaf.WAXY)
        builder.waterSource(waterSource = PlantWaterSource.RAIN_OR_SOIL)
        builder.habitat(habitat = PlantHabitat.TERRESTRIAL)
    }

    fun constructLotusPlant(builder: PlantBuilder) {
        builder.name(name = PlantName.LOTUS)
        builder.root(root = PlantRoot.WEAK)
        builder.stem(stem = PlantStem.SOFT)
        builder.leaf(leaf = PlantLeaf.THIN)
        builder.waterSource(waterSource = PlantWaterSource.SURROUNDING_WATER)
        builder.habitat(habitat = PlantHabitat.AQUATIC)
    }

}