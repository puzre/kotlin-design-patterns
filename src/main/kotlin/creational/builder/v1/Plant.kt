package org.puzre.creational.builder.v1

data class Plant private constructor(
    val leafs: Int? = null,
    val fruits: Int? = null,
    val nodes: Int? = null,
    val color: String? = null
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    override fun toString(): String {
        return "🪴 Plan\n" +
                "Leafs: ${leafs ?: "Unknown"}\n" +
                "Fruits: ${fruits ?: "Unknown"}\n" +
                "Nodes: ${nodes ?: "Unknown"}\n" +
                "Color: ${color ?: "Unknown"}"
    }

    data class Builder(
        private var leafs: Int? = null,
        private var fruits: Int? = null,
        private var nodes: Int? = null,
        private var color: String? = null
    ) {

        fun leafs(leafs: Int) = apply { this.leafs = leafs }
        fun fruits(fruits: Int) = apply { this.fruits = fruits }
        fun nodes(nodes: Int) = apply { this.nodes = nodes }
        fun color(color: String) = apply { this.color = color }
        fun build() = Plant(leafs = this.leafs, fruits = this.fruits, nodes = this.nodes, color = this.color)

    }

}