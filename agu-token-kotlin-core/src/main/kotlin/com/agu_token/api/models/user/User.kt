// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.user

import com.agu_token.api.core.ExcludeMissing
import com.agu_token.api.core.JsonField
import com.agu_token.api.core.JsonMissing
import com.agu_token.api.core.JsonValue
import com.agu_token.api.errors.AguTokenInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class User
private constructor(
    private val id: JsonField<Long>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val password: JsonField<String>,
    private val phone: JsonField<String>,
    private val username: JsonField<String>,
    private val userStatus: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userStatus") @ExcludeMissing userStatus: JsonField<Int> = JsonMissing.of(),
    ) : this(id, email, firstName, lastName, password, phone, username, userStatus, mutableMapOf())

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): String? = firstName.getNullable("firstName")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): String? = lastName.getNullable("lastName")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): String? = password.getNullable("password")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phone(): String? = phone.getNullable("phone")

    /**
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): String? = username.getNullable("username")

    /**
     * User Status
     *
     * @throws AguTokenInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userStatus(): Int? = userStatus.getNullable("userStatus")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    /**
     * Returns the raw JSON value of [userStatus].
     *
     * Unlike [userStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userStatus") @ExcludeMissing fun _userStatus(): JsonField<Int> = userStatus

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

        /** Returns a mutable builder for constructing an instance of [User]. */
        fun builder() = Builder()
    }

    /** A builder for [User]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var password: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var userStatus: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(user: User) = apply {
            id = user.id
            email = user.email
            firstName = user.firstName
            lastName = user.lastName
            password = user.password
            phone = user.phone
            username = user.username
            userStatus = user.userStatus
            additionalProperties = user.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun password(password: String) = password(JsonField.of(password))

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

        /** User Status */
        fun userStatus(userStatus: Int) = userStatus(JsonField.of(userStatus))

        /**
         * Sets [Builder.userStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userStatus] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userStatus(userStatus: JsonField<Int>) = apply { this.userStatus = userStatus }

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
         * Returns an immutable instance of [User].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): User =
            User(
                id,
                email,
                firstName,
                lastName,
                password,
                phone,
                username,
                userStatus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): User = apply {
        if (validated) {
            return@apply
        }

        id()
        email()
        firstName()
        lastName()
        password()
        phone()
        username()
        userStatus()
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
            (if (email.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1) +
            (if (lastName.asKnown() == null) 0 else 1) +
            (if (password.asKnown() == null) 0 else 1) +
            (if (phone.asKnown() == null) 0 else 1) +
            (if (username.asKnown() == null) 0 else 1) +
            (if (userStatus.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is User && id == other.id && email == other.email && firstName == other.firstName && lastName == other.lastName && password == other.password && phone == other.phone && username == other.username && userStatus == other.userStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, email, firstName, lastName, password, phone, username, userStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, username=$username, userStatus=$userStatus, additionalProperties=$additionalProperties}"
}
