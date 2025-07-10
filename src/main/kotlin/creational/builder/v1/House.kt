package org.puzre.creational.builder.v1

data class House private constructor(
    val doors: Int?,
    val windows: Int?,
    val color: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    override fun toString(): String {
        return "House (doors = $doors, windows = $windows, color = $color)"
    }

    data class Builder(
        private var doors: Int? = null,
        private var windows: Int? = null,
        private var color: String? = null
    ) {

        fun doors(doors: Int): Builder = apply { this.doors = doors }
        fun windows(windows: Int): Builder = apply { this.windows = windows }
        fun color(color: String): Builder = apply { this.color = color }
        fun build(): House = House(doors = this.doors, windows = this.windows, color = this.color)

    }

}
