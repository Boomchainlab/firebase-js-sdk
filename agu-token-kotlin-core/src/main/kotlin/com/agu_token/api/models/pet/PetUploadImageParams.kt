// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.models.pet

import com.agu_token.api.core.Params
import com.agu_token.api.core.http.Headers
import com.agu_token.api.core.http.QueryParams
import java.util.Objects

/** uploads an image */
class PetUploadImageParams
private constructor(
    private val petId: Long?,
    private val additionalMetadata: String?,
    private val image: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun petId(): Long? = petId

    /** Additional Metadata */
    fun additionalMetadata(): String? = additionalMetadata

    fun image(): String? = image

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PetUploadImageParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PetUploadImageParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PetUploadImageParams]. */
    class Builder internal constructor() {

        private var petId: Long? = null
        private var additionalMetadata: String? = null
        private var image: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(petUploadImageParams: PetUploadImageParams) = apply {
            petId = petUploadImageParams.petId
            additionalMetadata = petUploadImageParams.additionalMetadata
            image = petUploadImageParams.image
            additionalHeaders = petUploadImageParams.additionalHeaders.toBuilder()
            additionalQueryParams = petUploadImageParams.additionalQueryParams.toBuilder()
        }

        fun petId(petId: Long?) = apply { this.petId = petId }

        /**
         * Alias for [Builder.petId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun petId(petId: Long) = petId(petId as Long?)

        /** Additional Metadata */
        fun additionalMetadata(additionalMetadata: String?) = apply {
            this.additionalMetadata = additionalMetadata
        }

        fun image(image: String?) = apply { this.image = image }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PetUploadImageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PetUploadImageParams =
            PetUploadImageParams(
                petId,
                additionalMetadata,
                image,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): String? = image

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> petId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                additionalMetadata?.let { put("additionalMetadata", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PetUploadImageParams && petId == other.petId && additionalMetadata == other.additionalMetadata && image == other.image && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(petId, additionalMetadata, image, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PetUploadImageParams{petId=$petId, additionalMetadata=$additionalMetadata, image=$image, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
