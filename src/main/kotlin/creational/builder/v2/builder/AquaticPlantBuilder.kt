package org.puzre.creational.builder.v2.builder

import org.puzre.creational.builder.v2.component.PlantHabitat
import org.puzre.creational.builder.v2.component.PlantLeaf
import org.puzre.creational.builder.v2.component.PlantName
import org.puzre.creational.builder.v2.component.PlantRoot
import org.puzre.creational.builder.v2.component.PlantStem
import org.puzre.creational.builder.v2.component.PlantWaterSource
import org.puzre.creational.builder.v2.plant.AquaticPlant

class AquaticPlantBuilder : PlantBuilder {

    private var name: PlantName? = null
    private var root: PlantRoot? = null
    private var stem: PlantStem? = null
    private var leaf: PlantLeaf? = null
    private var waterSource: PlantWaterSource? = null
    private var habitat: PlantHabitat? = null

    override fun name(name: PlantName) {
        this.name = name
    }

    override fun root(root: PlantRoot) {
        this.root = root
    }

    override fun stem(stem: PlantStem) {
        this.stem = stem
    }

    override fun leaf(leaf: PlantLeaf) {
        this.leaf = leaf
    }

    override fun waterSource(waterSource: PlantWaterSource) {
        this.waterSource = waterSource
    }

    override fun habitat(habitat: PlantHabitat) {
        this.habitat = habitat
    }

    fun getResult(): AquaticPlant {
        return AquaticPlant(
            name = this.name,
            root = this.root,
            stem = this.stem,
            leaf = this.leaf,
            waterSource = this.waterSource,
            habitat = this.habitat
        )
    }

}