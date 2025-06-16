// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.pet.Pet
import com.agu_token.api.models.pet.PetCreateParams
import com.agu_token.api.models.pet.PetDeleteParams
import com.agu_token.api.models.pet.PetFindByStatusParams
import com.agu_token.api.models.pet.PetFindByTagsParams
import com.agu_token.api.models.pet.PetRetrieveParams
import com.agu_token.api.models.pet.PetUpdateByIdParams
import com.agu_token.api.models.pet.PetUpdateParams
import com.agu_token.api.models.pet.PetUploadImageParams
import com.agu_token.api.models.pet.PetUploadImageResponse
import com.google.errorprone.annotations.MustBeClosed

interface PetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetServiceAsync

    /** Add a new pet to the store */
    suspend fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** Returns a single pet */
    suspend fun retrieve(
        petId: Long,
        params: PetRetrieveParams = PetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** @see [retrieve] */
    suspend fun retrieve(petId: Long, requestOptions: RequestOptions): Pet =
        retrieve(petId, PetRetrieveParams.none(), requestOptions)

    /** Update an existing pet by Id */
    suspend fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pet

    /** delete a pet */
    suspend fun delete(
        petId: Long,
        params: PetDeleteParams = PetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(petId: Long, requestOptions: RequestOptions) =
        delete(petId, PetDeleteParams.none(), requestOptions)

    /** Multiple status values can be provided with comma separated strings */
    suspend fun findByStatus(
        params: PetFindByStatusParams = PetFindByStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see [findByStatus] */
    suspend fun findByStatus(requestOptions: RequestOptions): List<Pet> =
        findByStatus(PetFindByStatusParams.none(), requestOptions)

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    suspend fun findByTags(
        params: PetFindByTagsParams = PetFindByTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Pet>

    /** @see [findByTags] */
    suspend fun findByTags(requestOptions: RequestOptions): List<Pet> =
        findByTags(PetFindByTagsParams.none(), requestOptions)

    /** Updates a pet in the store with form data */
    suspend fun updateById(
        petId: Long,
        params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateById(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [updateById] */
    suspend fun updateById(
        params: PetUpdateByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [updateById] */
    suspend fun updateById(petId: Long, requestOptions: RequestOptions) =
        updateById(petId, PetUpdateByIdParams.none(), requestOptions)

    /** uploads an image */
    suspend fun uploadImage(
        petId: Long,
        params: PetUploadImageParams = PetUploadImageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse = uploadImage(params.toBuilder().petId(petId).build(), requestOptions)

    /** @see [uploadImage] */
    suspend fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PetUploadImageResponse

    /** @see [uploadImage] */
    suspend fun uploadImage(petId: Long, requestOptions: RequestOptions): PetUploadImageResponse =
        uploadImage(petId, PetUploadImageParams.none(), requestOptions)

    /** A view of [PetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pet`, but is otherwise the same as
         * [PetServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /**
         * Returns a raw HTTP response for `get /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            petId: Long,
            params: PetRetrieveParams = PetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet> = retrieve(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: PetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(petId: Long, requestOptions: RequestOptions): HttpResponseFor<Pet> =
            retrieve(petId, PetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /pet`, but is otherwise the same as
         * [PetServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: PetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pet>

        /**
         * Returns a raw HTTP response for `delete /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            petId: Long,
            params: PetDeleteParams = PetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: PetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(petId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(petId, PetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByStatus`, but is otherwise the same as
         * [PetServiceAsync.findByStatus].
         */
        @MustBeClosed
        suspend fun findByStatus(
            params: PetFindByStatusParams = PetFindByStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see [findByStatus] */
        @MustBeClosed
        suspend fun findByStatus(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByStatus(PetFindByStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pet/findByTags`, but is otherwise the same as
         * [PetServiceAsync.findByTags].
         */
        @MustBeClosed
        suspend fun findByTags(
            params: PetFindByTagsParams = PetFindByTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Pet>>

        /** @see [findByTags] */
        @MustBeClosed
        suspend fun findByTags(requestOptions: RequestOptions): HttpResponseFor<List<Pet>> =
            findByTags(PetFindByTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}`, but is otherwise the same as
         * [PetServiceAsync.updateById].
         */
        @MustBeClosed
        suspend fun updateById(
            petId: Long,
            params: PetUpdateByIdParams = PetUpdateByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateById(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [updateById] */
        @MustBeClosed
        suspend fun updateById(
            params: PetUpdateByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [updateById] */
        @MustBeClosed
        suspend fun updateById(petId: Long, requestOptions: RequestOptions): HttpResponse =
            updateById(petId, PetUpdateByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pet/{petId}/uploadImage`, but is otherwise the
         * same as [PetServiceAsync.uploadImage].
         */
        @MustBeClosed
        suspend fun uploadImage(
            petId: Long,
            params: PetUploadImageParams = PetUploadImageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(params.toBuilder().petId(petId).build(), requestOptions)

        /** @see [uploadImage] */
        @MustBeClosed
        suspend fun uploadImage(
            params: PetUploadImageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PetUploadImageResponse>

        /** @see [uploadImage] */
        @MustBeClosed
        suspend fun uploadImage(
            petId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PetUploadImageResponse> =
            uploadImage(petId, PetUploadImageParams.none(), requestOptions)
    }
}
