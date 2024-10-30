package dev.matytyma.opencraft.pack.model

import dev.matytyma.opencraft.pack.NamespacedKey
import dev.matytyma.opencraft.serializer.NamespacedKeyMapSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ItemModel(
    override val parent: NamespacedKey,
    @Serializable(NamespacedKeyMapSerializer::class)
    override val textures: Map<String, NamespacedKey>,
    val overrides: List<ModelOverride<ItemPredicate>>? = null,
) : Model

@Serializable
data class ItemPredicate(
    @SerialName("custom_model_data")
    val customModelData: Int,
) : Predicate
