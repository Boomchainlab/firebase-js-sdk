// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models

import com.agu_token.api.core.Enum
import com.agu_token.api.core.ExcludeMissing
import com.agu_token.api.core.JsonField
import com.agu_token.api.core.JsonMissing
import com.agu_token.api.core.JsonValue
import com.agu_token.api.errors.AguTokenInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Order
private constructor(
    private val id: JsonField<Long>,
    private val complete: JsonField<Boolean>,
    private val petId: JsonField<Long>,
    private val quantity: JsonField<Int>,
    private val shipDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("complete") @ExcludeMissing complete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("petId") @ExcludeMissing petId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("shipDate")
        @ExcludeMissing
        shipDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(id, complete, petId, quantity, shipDate, status, mutableMapOf())

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun complete(): Boolean? = complete.getNullable("complete")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun petId(): Long? = petId.getNullable("petId")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Int? = quantity.getNullable("quantity")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shipDate(): OffsetDateTime? = shipDate.getNullable("shipDate")

    /**
     * Order Status
     *
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [complete].
     *
     * Unlike [complete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("complete") @ExcludeMissing fun _complete(): JsonField<Boolean> = complete

    /**
     * Returns the raw JSON value of [petId].
     *
     * Unlike [petId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("petId") @ExcludeMissing fun _petId(): JsonField<Long> = petId

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [shipDate].
     *
     * Unlike [shipDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipDate") @ExcludeMissing fun _shipDate(): JsonField<OffsetDateTime> = shipDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Order]. */
        fun builder() = Builder()
    }

    /** A builder for [Order]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var complete: JsonField<Boolean> = JsonMissing.of()
        private var petId: JsonField<Long> = JsonMissing.of()
        private var quantity: JsonField<Int> = JsonMissing.of()
        private var shipDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(order: Order) = apply {
            id = order.id
            complete = order.complete
            petId = order.petId
            quantity = order.quantity
            shipDate = order.shipDate
            status = order.status
            additionalProperties = order.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun complete(complete: Boolean) = complete(JsonField.of(complete))

        /**
         * Sets [Builder.complete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun complete(complete: JsonField<Boolean>) = apply { this.complete = complete }

        fun petId(petId: Long) = petId(JsonField.of(petId))

        /**
         * Sets [Builder.petId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.petId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun petId(petId: JsonField<Long>) = apply { this.petId = petId }

        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        fun shipDate(shipDate: OffsetDateTime) = shipDate(JsonField.of(shipDate))

        /**
         * Sets [Builder.shipDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipDate(shipDate: JsonField<OffsetDateTime>) = apply { this.shipDate = shipDate }

        /** Order Status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Order].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Order =
            Order(
                id,
                complete,
                petId,
                quantity,
                shipDate,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Order = apply {
        if (validated) {
            return@apply
        }

        id()
        complete()
        petId()
        quantity()
        shipDate()
        status()?.validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: AguTokenInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (complete.asKnown() == null) 0 else 1) +
            (if (petId.asKnown() == null) 0 else 1) +
            (if (quantity.asKnown() == null) 0 else 1) +
            (if (shipDate.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0)

    /** Order Status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PLACED = of("placed")

            val APPROVED = of("approved")

            val DELIVERED = of("delivered")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PLACED,
            APPROVED,
            DELIVERED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLACED,
            APPROVED,
            DELIVERED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PLACED -> Value.PLACED
                APPROVED -> Value.APPROVED
                DELIVERED -> Value.DELIVERED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AguTokenInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PLACED -> Known.PLACED
                APPROVED -> Known.APPROVED
                DELIVERED -> Known.DELIVERED
                else -> throw AguTokenInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AguTokenInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw AguTokenInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: AguTokenInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Order && id == other.id && complete == other.complete && petId == other.petId && quantity == other.quantity && shipDate == other.shipDate && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, complete, petId, quantity, shipDate, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Order{id=$id, complete=$complete, petId=$petId, quantity=$quantity, shipDate=$shipDate, status=$status, additionalProperties=$additionalProperties}"
}
