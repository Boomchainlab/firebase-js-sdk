// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.pet

import com.agu_token.api.core.Enum
import com.agu_token.api.core.ExcludeMissing
import com.agu_token.api.core.JsonField
import com.agu_token.api.core.JsonMissing
import com.agu_token.api.core.JsonValue
import com.agu_token.api.core.checkKnown
import com.agu_token.api.core.checkRequired
import com.agu_token.api.core.toImmutable
import com.agu_token.api.errors.AguTokenInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class Pet
private constructor(
    private val name: JsonField<String>,
    private val photoUrls: JsonField<List<String>>,
    private val id: JsonField<Long>,
    private val category: JsonField<Category>,
    private val status: JsonField<Status>,
    private val tags: JsonField<List<Tag>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("photoUrls")
        @ExcludeMissing
        photoUrls: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
    ) : this(name, photoUrls, id, category, status, tags, mutableMapOf())

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun photoUrls(): List<String> = photoUrls.getRequired("photoUrls")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Category? = category.getNullable("category")

    /**
     * pet status in the store
     *
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): List<Tag>? = tags.getNullable("tags")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [photoUrls].
     *
     * Unlike [photoUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("photoUrls") @ExcludeMissing fun _photoUrls(): JsonField<List<String>> = photoUrls

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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

        /**
         * Returns a mutable builder for constructing an instance of [Pet].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Pet]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var photoUrls: JsonField<MutableList<String>>? = null
        private var id: JsonField<Long> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tags: JsonField<MutableList<Tag>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pet: Pet) = apply {
            name = pet.name
            photoUrls = pet.photoUrls.map { it.toMutableList() }
            id = pet.id
            category = pet.category
            status = pet.status
            tags = pet.tags.map { it.toMutableList() }
            additionalProperties = pet.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun photoUrls(photoUrls: List<String>) = photoUrls(JsonField.of(photoUrls))

        /**
         * Sets [Builder.photoUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.photoUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun photoUrls(photoUrls: JsonField<List<String>>) = apply {
            this.photoUrls = photoUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [photoUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhotoUrl(photoUrl: String) = apply {
            photoUrls =
                (photoUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("photoUrls", it).add(photoUrl)
                }
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** pet status in the store */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

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
         * Returns an immutable instance of [Pet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * .photoUrls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Pet =
            Pet(
                checkRequired("name", name),
                checkRequired("photoUrls", photoUrls).map { it.toImmutable() },
                id,
                category,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Pet = apply {
        if (validated) {
            return@apply
        }

        name()
        photoUrls()
        id()
        category()?.validate()
        status()?.validate()
        tags()?.forEach { it.validate() }
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
        (if (name.asKnown() == null) 0 else 1) +
            (photoUrls.asKnown()?.size ?: 0) +
            (if (id.asKnown() == null) 0 else 1) +
            (category.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** pet status in the store */
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

            val AVAILABLE = of("available")

            val PENDING = of("pending")

            val SOLD = of("sold")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            AVAILABLE,
            PENDING,
            SOLD,
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
            AVAILABLE,
            PENDING,
            SOLD,
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
                AVAILABLE -> Value.AVAILABLE
                PENDING -> Value.PENDING
                SOLD -> Value.SOLD
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
                AVAILABLE -> Known.AVAILABLE
                PENDING -> Known.PENDING
                SOLD -> Known.SOLD
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

    class Tag
    private constructor(
        private val id: JsonField<Long>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, mutableMapOf())

        /**
         * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Long? = id.getNullable("id")

        /**
         * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Tag]. */
            fun builder() = Builder()
        }

        /** A builder for [Tag]. */
        class Builder internal constructor() {

            private var id: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tag: Tag) = apply {
                id = tag.id
                name = tag.name
                additionalProperties = tag.additionalProperties.toMutableMap()
            }

            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Tag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Tag = Tag(id, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
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
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) + (if (name.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tag && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tag{id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Pet && name == other.name && photoUrls == other.photoUrls && id == other.id && category == other.category && status == other.status && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, photoUrls, id, category, status, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Pet{name=$name, photoUrls=$photoUrls, id=$id, category=$category, status=$status, tags=$tags, additionalProperties=$additionalProperties}"
}
