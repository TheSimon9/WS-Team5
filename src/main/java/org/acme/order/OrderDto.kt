package org.acme.order

import java.math.BigDecimal
import java.util.*

data class OrderDto(
    val id: UUID,
)

data class BirraDto(
    val type: String,
    val price: BigDecimal,
    val quantity: Int,
)