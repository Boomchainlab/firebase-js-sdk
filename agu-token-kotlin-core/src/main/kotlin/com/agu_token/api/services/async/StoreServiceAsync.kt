// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.store.StoreListInventoryParams
import com.agu_token.api.models.store.StoreListInventoryResponse
import com.agu_token.api.services.async.store.OrderServiceAsync
import com.google.errorprone.annotations.MustBeClosed

interface StoreServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): StoreServiceAsync

    fun order(): OrderServiceAsync

    /** Returns a map of status codes to quantities */
    suspend fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreListInventoryResponse

    /** @see [listInventory] */
    suspend fun listInventory(requestOptions: RequestOptions): StoreListInventoryResponse =
        listInventory(StoreListInventoryParams.none(), requestOptions)

    /** A view of [StoreServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): StoreServiceAsync.WithRawResponse

        fun order(): OrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/inventory`, but is otherwise the same as
         * [StoreServiceAsync.listInventory].
         */
        @MustBeClosed
        suspend fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreListInventoryResponse>

        /** @see [listInventory] */
        @MustBeClosed
        suspend fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(StoreListInventoryParams.none(), requestOptions)
    }
}
